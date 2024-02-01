package HW03.OCP;

public class ElectricBoiler extends Boiler{

    public ElectricBoiler(String type, int kWtCost) {
        super("Электрический", kWtCost);
    }
    @Override
    public void operationCost(int time){
        System.out.println("Затраты на эксплуатацию " + this.type + " котел равны :" + time * this.kWtCost * 0.8);
    }
}
