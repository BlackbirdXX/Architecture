package HW03.DIP;

public class Electric implements Heater{

    @Override
    public void heat() {
        System.out.println("Используем электричество - греем дом.");
    }
    
}
