package HW04;

public class CashProvider {
    long card;
    boolean isAuthorization;

    public CashProvider(long card){
        this.card = card;
        this.isAuthorization = false;
    }

    public boolean buyTicket(int price){
        int balance = 100;
        if(balance > price){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean repealTicket(){
        return true;
    }

    public boolean authorization(long card){
        if(card != 0){
            return true;
        }
        else{
            return false;
        }
    }
}
