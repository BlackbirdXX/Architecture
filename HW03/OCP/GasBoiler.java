package HW03.OCP;

public class GasBoiler extends Boiler{

    public GasBoiler(String type, int kWtCost) {
        super("Газовый", kWtCost);
    }
    @Override
    public void operationCost(int time){
        System.out.println("Затраты на эксплуатацию " + this.type + " котел равны :" + time * this.kWtCost * 0.5);
    }
}
