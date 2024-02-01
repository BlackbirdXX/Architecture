package HW03.ISP;

public class MainISP {
    public static void main(String[] args) {
        Electricboiler eb = new Electricboiler();
        GasBoiler gb = new GasBoiler();
        System.out.println("Электрокотел потребляет " + eb.electro() + " электричества.");
        System.out.println("Газовый котел потребляет " + gb.electro() + " электричества. И выбрасывает " + gb.exhaust() + " газа.");
    }
}
