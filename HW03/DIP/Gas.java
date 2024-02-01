package HW03.DIP;

public class Gas implements Heater{

    @Override
    public void heat() {
        System.out.println("Жгем газ - греем здание.");
    }
    
}
