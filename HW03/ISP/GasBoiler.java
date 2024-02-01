package HW03.ISP;

public class GasBoiler implements Exhaust{
    int electric;
    int exhaust;

    public GasBoiler(){
        this.electric = 1;
        this.exhaust = 10;
    }

    @Override
    public int electro() {
        return this.electric;
    }

    @Override
    public int exhaust() {
        return this.exhaust;
    }
    
}
