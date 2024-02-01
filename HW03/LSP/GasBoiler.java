package HW03.LSP;

public class GasBoiler extends Boiler{
    String fuel;
    String heatingElement;

    public GasBoiler(String fuel, String heatingElement){
        this.fuel = "Газ";
        this.heatingElement = "Горелку";
    }

    @Override
    void heat() {
        System.out.println("Газовый котел жгет " + this.fuel + ", нагревая " + this.heatingElement);
    }
    
}
