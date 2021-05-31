class Temperature {
    constructor(C) {
        this.C = C;
    }
    getCtoF() {
        return (this.C * 1.8) + 32;
    };
    getCtoKenvin() {
        return this.C + 273.15;
    };
    // setTemperature(temperature) {
    //     this.temperature = temperature;
    //     return temperature;
    // }
}
let temperature = new Temperature(30);
let CtoF = temperature.getCtoF();
let CtoK = temperature.getCtoKenvin();
document.writeln(temperature.C + " độ C chuyển sang độ F là: " + CtoF + "<br>");
document.writeln(temperature.C + " độ C chuyển sang độ K là: " + CtoK +"<br>");