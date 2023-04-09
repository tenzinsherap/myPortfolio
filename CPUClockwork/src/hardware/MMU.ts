import {System} from "../System";

import {Hardware} from "./Hardware";
import {Memory} from "./Memory";

// Static Program Into Memory
const TEST_PROGRAM = [
    0xA9,
    0x00,
    0x8D,
    0x40,
    0x00,
    0xA9,
    0x01,
    0x6D,
    0x40,
    0x00,
    0xAC,
    0x40,
    0x00,
    0xA2,
    0x01,
    0xFF,
    0x50,
    0x00,
    0xD0,
    0xED,
    0x00
];

export class MMU extends Hardware {
    private memory : Memory = null;

    constructor() {
        super("MMU", 0);
    }

    public readImmediate(addr : number) : number {
        //This set the MAR with the address and pass to MDR
        this.memory.setMAR(addr);
        this.memory.read();
        return this.memory.getMDR();
    }

    public writeImmediate(addr : number, value : number) {
        //This set the MAR with the address
        this.memory.setMAR(addr);
        this.memory.setMDR(value);
        this.memory.write();
    }

    public writeTestProgram() {
        //Write to memory
        for(var addr = 0x00; addr < TEST_PROGRAM.length; addr++) {
            this.writeImmediate(addr, TEST_PROGRAM[addr]);
        }
    }

    public read() {
        //pass to memory.read()
        this.memory.read();
    }

    public write() {
        //pass to memory.write()
        this.memory.write();
    }
   
    public setMDR(value : number) {
        this.memory.setMDR(value);
    }

    public getMDR() {
        return this.memory.getMDR();
    }

    public logAddress(addr : number) {
        //convert to hex 
        let value = this.readImmediate(addr);
        this.log("Addr " + this.hexLog(addr, 2) +
                 " - " + this.hexLog(value, 2));
    }

    public memoryDump(start : number, end : number) {
        this.log("Memory Dump: Debug");
        //input the data values in range
        for(var addr = start; addr <= end; addr++) {
            this.logAddress(addr);
        }        
        this.log("Memory Dump: Complete");
        this.log("---------------------------------");


    }
    public setMemory(memory : Memory) {
        //keep a reference to the memory instance.
        this.memory = memory;
    }

    public readImmediateLE(lob : number, hob : number) : number {
        // convert LE with highest order byte
        return this.readImmediate(this.getLittleEndian(lob, hob));
    }

    public writeImmediateLE(lob : number, hob : number, value : number) {
        // address given in little-endian format
        this.writeImmediate(this.getLittleEndian(lob, hob), value);
    }
    public setMARLowOrderByte(lob : number) {
        // high order byte 
        let hob = this.getHOB(this.memory.getMAR());

        //now, the new address is just lob + hob
        this.memory.setMAR(this.getLittleEndian(lob, hob));
    }
    
    public setMARHighOrderByte(hob : number) {
        // low order byte 
        let lob = this.getLOB(this.memory.getMAR());

        //shift the hob upwards by * with 0xFF
        this.memory.setMAR(this.getLittleEndian(lob, hob));
    }





}
