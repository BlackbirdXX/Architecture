package HW03.OCP;

public class Boiler {
    public String type;
    public int kWtCost;

    public Boiler(String type, int kWtCost){
        this.type = type;
        this.kWtCost = kWtCost;
    }

    public void operationCost(int time){
        System.out.println("Затраты на эксплуатацию " + this.type + " котел равны :" + time * this.kWtCost);
    }
}
