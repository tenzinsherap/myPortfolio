import {System} from "../System";

import {Hardware} from "./Hardware";
import {ClockListener} from "./Imp/ClockListener";

const MEM_SIZE = 0x10000;

export class Memory extends Hardware implements ClockListener {
    
    //This array stores 2 hex 
    private array : number[];
    
    //This initializes MAR/MDR 
    private MAR : number;
    private MDR : number;
    

    constructor() {
        super("RAM id:", 0); 
    }

    public reset() {
        // This logs a created messaage 
        this.log("Created: " + MEM_SIZE);

        // This clear the Mem add and decode
        this.MAR = 0x0000;
        this.MDR = 0x00;

        //This initializes data array 
        this.array = new Array(MEM_SIZE);

        //This loops and set everything to 0x00
        for(var addr = 0x00; addr < MEM_SIZE; addr++) {
            this.array[addr] = 0x00;
        }        
    }
    public pulse() {
        //This indicate that the pulse was received
        this.log("Received clock pulse");
    }

    public read() {
        //This reads address
        this.MDR = this.array[this.MAR];
    }
    
    public write() {
        //This sends data to the MDR
        this.array[this.MAR] = this.MDR;
    }

    public getMAR() : number {
        return this.MAR;
    }

    public getMDR() : number {
        return this.MDR;
    }

    public setMAR(val : number) {
        this.MAR = val;
    }

    public setMDR(val : number) {
        this.MDR = val;
    }
 
}
