package ch7_proxy;

/**
 * Created by nnkwrik
 * 18/10/10 18:32
 */
public class Proxy implements GiveGift{

    Pursuit boy;

    public Proxy(String girl) {
        boy = new Pursuit(girl);
    }

    @Override
    public void giveMoney() {
        boy.giveMoney();
    }

    @Override
    public void giveCar() {
        boy.giveCar();
    }

    @Override
    public void giveHouse() {
        boy.giveHouse();
    }
}
