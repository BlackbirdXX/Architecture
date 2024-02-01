package HW03.OCP;

public class DieselBoiler extends Boiler{

    public DieselBoiler(String type, int kWtCost) {
        super("Дизельный", kWtCost);
    }
    @Override
    public void operationCost(int time){
        System.out.println("Затраты на эксплуатацию " + this.type + " котел равны :" + time * this.kWtCost * 1.5);
    }
}
