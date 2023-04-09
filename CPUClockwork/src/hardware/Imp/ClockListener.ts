import {System} from "../../System";

export interface ClockListener {
    //notify all clock-attached hardware when a clock pulse occurs
    pulse() : void
}
