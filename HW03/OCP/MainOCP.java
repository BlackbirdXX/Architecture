package HW03.OCP;

public class MainOCP {
    public static void main(String[] args) {
        Boiler boiler = new Boiler("Дровяной", 5);
        boiler.operationCost(1);
        boiler = new ElectricBoiler(null, 5);
        boiler.operationCost(1);
        boiler = new GasBoiler(null, 5);
        boiler.operationCost(1);
        boiler = new DieselBoiler(null, 5);
        boiler.operationCost(1);
    }
}
