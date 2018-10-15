package ch7_proxy;

/**
 * Created by nnkwrik
 * 18/10/10 18:30
 */
public class Pursuit implements GiveGift{

    String girl;

    public Pursuit(String girl) {
        this.girl = girl;
    }

    @Override
    public void giveMoney() {
        System.out.println("Give some money to "+girl);
    }

    @Override
    public void giveCar() {
        System.out.println("Buy a car for "+girl);
    }

    @Override
    public void giveHouse() {
        System.out.println("Buy a house for "+girl);
    }
}
