package HW03.DIP;

public class Boiler {
    Heater boiler;

    public Boiler(Heater boiler){
        this.boiler = boiler;
    }
    void heat(){
        boiler.heat();
    }
}
