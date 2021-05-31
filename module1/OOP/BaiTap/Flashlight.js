class Battery {
    constructor(energy) {
        this.energy = energy;
    };
    getEnergy() {
        return this.energy;
    };
    decreaseEnergy() {
        if (this.energy > 0) {
            this.energy--;
        }
    }
}
class FlashLamp {
    constructor(battery) {
        this.battery = battery;
    };
    getBatteryInfo() {
        return this.battery.getEnergy();
    };
    light() {
        if (this.status) {
            alert("Lighting");
        } else {
            alert("Not lighting");
        }
    };
    turnOn_TurnOff() {
        this.status = !this.status;
    };
}
let battery = new Battery(10);
let flashLamp = new FlashLamp(battery);
document.write("Battery info:" + flashLamp.getBatteryInfo() + "<br/>");
flashLamp.light();
document.write("Turn on<br/>");
flashLamp.turnOn_TurnOff();
flashLamp.light();
document.write("Battery info:" + flashLamp.getBatteryInfo() + "<br/>");
document.write("Turn off<br/>");
flashLamp.turnOn_TurnOff();
flashLamp.light();
