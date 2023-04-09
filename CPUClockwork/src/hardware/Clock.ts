import {System} from "../System";

import {Hardware} from "./Hardware";
import {ClockListener} from "./imp/ClockListener";

const CLOCK_INTERVAL= 500;               // This is in ms (milliseconds) so 1000 = 1 second, 100 = 1/10 second

export class Clock extends Hardware {
    private timer = null;

    private listeners : ClockListener[] = null; 

    constructor() {
       super("CLK", 0); 

       //Set as an empty array
       this.listeners = new Array(0);
    }
    private pulse() {
      this.log("Clock Pulse Initalized");

      for(let listener of this.listeners){
          listener.pulse();
      }
  }

  public addListener(listener : ClockListener) {
      //Push element to array
      this.listeners.push(listener);
  }

  public removeListener(listener : ClockListener) {
      //loop over all listeners
      for(var i = 0; i < this.listeners.length; i++) {

          //remove this listener if it matches the arument
          if(this.listeners[i] == listener) {
              this.listeners.splice(i, 1);
          }
      }
  }

  public start() {
      this.timer = setInterval(() => { this.pulse() }, CLOCK_INTERVAL);
  }

  public stop() {
      if(this.timer != null){
          clearInterval(this.timer);
      }
  }
}
