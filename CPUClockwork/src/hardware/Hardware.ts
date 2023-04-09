import {System} from "../System";

export class Hardware {

    public hName: string = "Unknown";
    public hID: number = 0;

    public debug: boolean = true;

    constructor(name: string, id: number) {
        //This sets this object's name and ID
        this.hName = name;
        this.hID = id;
    }

    public log(msg: string) {
        //only log in debug mode
        if(this.debug) {
            //fetch time
            let time_ms = new Date().getTime();

            //Output the log message 
            let out = "[HW - " + this.hName + " ID: " + this.hID + " @" + time_ms + "ms]: " + msg;

            console.log(out);
        }
    }

    public hexLog(value: number, digits: number): string {
        //Hexlog function to convert 
        var str = value.toString(16).toUpperCase();

        //make sure the number of digits has enough leading 0s
        while(str.length < digits) {
            str = "0"+str;
        }

        //add 0x 
        return "0x"+str;
    }

    public hexValue(value: number, digits: number): string {
        //if the value isn't defined, return an error
        if(value == undefined){
            return "ERR [hexValue conversion]: number undefined";    
        }

        //convert value to a hex string in upper case
        var str = value.toString(16).toUpperCase();

        //make sure the number of digits has enough leading 0s
        while(str.length < digits) {
            str = "0"+str;
        }

        //add 0x to indicate that it's hex
        return "0x"+str;
    }
    public getLOB(data: number) {
        return data & 0x00FF;
    }

    public getHOB(data: number) {
        return (data & 0xFF00) >> 0x8;
    }

    public getLittleEndian(lob: number, hob: number) {
        return lob + hob*0xFF;
    }
}

