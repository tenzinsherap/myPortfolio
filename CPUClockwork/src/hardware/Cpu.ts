import {System} from "../System";

import {Hardware} from "./Hardware";
import {MMU} from "./MMU";
import {ClockListener} from "./imp/ClockListener";

enum CpuInstruction {
    LDA_CON = 0xA9,     
    LDA_MEM = 0xAD, 
    LDX_CON = 0xA2,  
    LDX_MEM = 0xAE,
    LDY_CON = 0xA0,
    LDY_MEM = 0xAC,
    STA     = 0x8D,
    TXA     = 0x8A,
    TYA     = 0x98,
    ADC     = 0x6D,
    TAX     = 0xAA,
    TAY     = 0xA8,
    NOP     = 0xEA,
    BRK     = 0x00,
    CPX     = 0xEC,
    BNE     = 0xD0,
    INC     = 0xEE,
    SYS     = 0xFF
}

export class Cpu extends Hardware implements ClockListener{
    private cpuClockCount : number = 0;

    //Pulse from instrution
    private fetchPulse : number = 0;

    // Initialize the registers
    private programCounter : number = 0;
    private accumulator : number = 0x00;
    private xRegister : number = 0x00;
    private yRegister :  number = 0x00;
    private zFlag : number = 0x0; 

    //Set of instructions fetched
    private currentInstruction : CpuInstruction = null;
    private currentLOB : number = null;
    private currentHOB : number = null;

   
    private mmu : MMU = null;

    constructor() {
       super("CPU", 0); 
    }

    linkMMU(mmu : MMU) {
        this.mmu = mmu;
    }

    pulse() {
        // This increments cpu clock count
        this.cpuClockCount++;
        this.log("CPU State |" + 
                " Mode: 0" + 
                " PC: " + this.hexValue(this.programCounter, 4) + 
                " IR: " + this.hexValue(this.currentInstruction, 2) + 
                " Acc: " + this.hexValue(this.accumulator, 2) + 
                " xReg: " + this.hexValue(this.xRegister, 2) + 
                " yReg: " + this.hexValue(this.yRegister, 2) + 
                " zFlag: " + this.hexValue(this.zFlag, 1) + 
                " Step: " + this.hexValue(this.cpuClockCount - this.fetchPulse, 1));

        //fetch, decode, then execute
        if(!this.fetch()) {
            if(!this.decode()) {
                this.execute();
            }
        }

        //Checking for interrupt
        this.interruptCheck();
    }

    fetch() {
        if(this.currentInstruction == null) {

            this.fetchPulse = this.cpuClockCount;
            this.currentInstruction = this.getNextByte();
            return true;
        } 

        return false;
    }

    decode() {
        if(this.getInstructionOps() > 0 && this.currentLOB == null) {

            this.currentLOB = this.getNextByte(); 
            return true;

        } else if(this.getInstructionOps() > 1 && this.currentHOB == null) {

            this.currentHOB = this.getNextByte(); 
            return true;
        }

        return false;
    }

    execute() {
        switch(this.currentInstruction) {
            case CpuInstruction.LDA_CON:
                this.accumulator = this.currentLOB;
                break;

            case CpuInstruction.LDA_MEM:
                this.accumulator = this.mmu.readImmediateLE(this.currentLOB, this.currentHOB);
                break;

            case CpuInstruction.STA:
                this.mmu.writeImmediateLE(this.currentLOB, this.currentHOB, this.accumulator);
                break;

            case CpuInstruction.TXA:
                this.accumulator = this.xRegister;
                break;

            case CpuInstruction.TYA:
                this.accumulator = this.yRegister;
                break;

            case CpuInstruction.ADC:
                this.accumulator += this.mmu.readImmediateLE(this.currentLOB, this.currentHOB);
                break;

            case CpuInstruction.LDX_CON:
                this.xRegister = this.currentLOB;
                break;

            case CpuInstruction.LDX_MEM:
                this.xRegister = this.mmu.readImmediateLE(this.currentLOB, this.currentHOB);
                break;

            case CpuInstruction.TAX:
                this.xRegister = this.accumulator;
                break;

            case CpuInstruction.LDY_CON:
                this.yRegister = this.currentLOB;
                break;
            
            case CpuInstruction.LDY_MEM:
                this.yRegister = this.mmu.readImmediateLE(this.currentLOB, this.currentHOB);
                break;

            case CpuInstruction.TAY:
                this.yRegister = this.accumulator;
                break;

            case CpuInstruction.BRK:
                process.exit(0);
                break;

            case CpuInstruction.CPX:
                if(this.xRegister == this.mmu.readImmediateLE(this.currentLOB, this.currentHOB)){
                    this.zFlag = 0x01;
                }
                break;

            case CpuInstruction.BNE:
                if(this.zFlag == 0x00) {
                    this.programCounter += this.currentLOB;
                }
                break;

            case CpuInstruction.INC:
                let a = this.mmu.readImmediateLE(this.currentLOB, this.currentHOB);
                this.mmu.writeImmediateLE(this.currentLOB, this.currentHOB, a+0x01);
                break;

            case CpuInstruction.SYS:
                if(this.xRegister == 0x01) {
                    console.log("[SYSLOG] "+this.yRegister);   
                } else if(this.xRegister == 0x02) {
                    console.log("[SYSLOG] "+this.yRegister);   
                }

            //if instruction is not recognized, ignore it
            default:
                break;
        }

        this.clearInstruction();
    }

    interruptCheck() {

    }

    getInstructionOps() {
        //Find bytes needed for instruction
        switch(this.currentInstruction) {
            case CpuInstruction.LDA_MEM:
            case CpuInstruction.LDX_MEM:
            case CpuInstruction.LDY_MEM:
            case CpuInstruction.STA:
            case CpuInstruction.ADC:
            case CpuInstruction.CPX:
            case CpuInstruction.INC:
            case CpuInstruction.SYS:
                return 2;
                break;
            case CpuInstruction.LDA_CON:
            case CpuInstruction.LDX_CON:
            case CpuInstruction.LDY_CON:
            case CpuInstruction.BNE:
                return 1;
                break;
            default:
                return 0;
                break;
        }
    }

    getNextByte() {
        let data = this.mmu.readImmediate(this.programCounter);
        this.programCounter++;
        return data;
    }

    clearInstruction() {
        this.currentInstruction = null;
        this.currentLOB = null;
        this.currentHOB = null;
    }
}
