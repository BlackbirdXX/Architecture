package HW03.SRP;

public class Heat {
    int setoint;

    public Heat(int setoint){
        this.setoint = setoint;
    }

    public double timeHeat(Boiler boiler){
        return (((1000 * 4.2 *10)/boiler.getPower())/60); 
    }
}
