package HW03.DIP;

public class MainDIP {
    public static void main(String[] args) {
        Boiler boiler = new Boiler(new Electric());
        boiler.heat();
        boiler = new Boiler(new Gas());
        boiler.heat();
    }
}
