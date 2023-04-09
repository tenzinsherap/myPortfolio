// import statements for hardware
import {Hardware} from "./hardware/Hardware";
import {Cpu} from "./hardware/Cpu";
import {Memory} from "./hardware/Memory";
import {MMU} from "./hardware/MMU";
import {Clock} from "./hardware/Clock";

/*
    Constants
 */
// Initialization Parameters for Hardware
// Clock cycle interval
const CLOCK_INTERVAL= 500;               // This is in ms (milliseconds) so 1000 = 1 second, 100 = 1/10 second
                                        // A setting of 100 is equivalent to 10hz, 1 would be 1,000hz or 1khz,
                                        // .001 would be 1,000,000 or 1mhz. Obviously you will want to keep this
                                        // small, I recommend a setting of 100, if you want to slow things down
                                        // make it larger.

export class System extends Hardware {

    //hardware objects
    private _CPU : Cpu = null;
    private _Memory : Memory = null;
    private _MMU : MMU = null;
    private _Clock : Clock = null;
    private _Keyboard: Hardware = null; 
    public running: boolean = false;

    constructor() {
        super("SYS", 0);

        //call hardware constructors
        this._CPU = new Cpu();
        this._Memory = new Memory();
        this._MMU = new MMU();
        this._Clock = new Clock();

        
        /*
        Start the system (Analogous to pressing the power button and having voltages flow through the components)
        When power is applied to the system clock, it begins sending pulses to all clock observing hardware
        components so they can act on each clock cycle.
         */

        this.startSystem();
    }

    public startSystem() : boolean {
        // generate output text 
        this.log("Created");

        this._CPU.log("Created");
        this._Clock.log("Created");
        this._Keyboard.log("Created"); 
        
        // log MMU creation
        this._Memory.reset();
        this._MMU.log("Created");

        //set debug to false 
        this._Memory.debug = false;
        this._MMU.debug = false;
        this._Clock.debug = false;
        
        this._MMU.setMemory(this._Memory);
        this._MMU.writeTestProgram();
        this._MMU.memoryDump(0x00, 0x0F);

        //add memory 
        this._Clock.addListener(this._CPU);
        this._Clock.addListener(this._Memory);

  
        this._Clock.start();


        this._CPU.linkMMU(this._MMU);

        this.running = true;

        return true;
    }

    public stopSystem() : boolean {
        this._Clock.stop();

        return false;
    }
}

let system: System = new System();
