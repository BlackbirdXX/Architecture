package HW03.SRP;

public class MainSRP {

public static void main(String[] args) {
    Boiler boiler = new Boiler("Baxi", 50);
    Heat heat = new Heat(60);
    System.out.printf("Водонагреватель нагреет тонну воды за %.2f минут", heat.timeHeat(boiler));
}
}
