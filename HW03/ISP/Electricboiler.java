package HW03.ISP;

public class Electricboiler implements ElectricityConsumption{
    int electric;

    public Electricboiler(){
        this.electric = 12;
    }
    @Override
    public int electro() {
        return this.electric;
    }
    
}
