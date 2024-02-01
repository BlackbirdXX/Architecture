package HW03.LSP;

public class MainLSP {
    public static void main(String[] args) {
        Boiler eBoiler = new ElectricBoiler(null, null);
        eBoiler.heat();
        Boiler gBoiler = new GasBoiler(null, null);
        gBoiler.heat();
        eBoiler = gBoiler;
        eBoiler.heat();
    }
}
