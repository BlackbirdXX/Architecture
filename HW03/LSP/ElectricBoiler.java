package HW03.LSP;

public class ElectricBoiler extends Boiler{
    String fuel;
    String heatingElement;

    public ElectricBoiler(String fuel, String heatingElement){
        this.fuel = "Электричество";
        this.heatingElement = "ТЭН";
    }

    @Override
    void heat() {
        System.out.println("Электрокотел жгет " + this.fuel + ", нагревая " + this.heatingElement);
    }
    
}
