package HW04;



public class Ticket {
    int rootNumber;
    int price;
    int place;
    boolean isValid;

    public Ticket(int rootNumber, int place){
        this.rootNumber = rootNumber;
        this.price = 100;
        this.place = place;
        this.isValid = true;
    }
}
