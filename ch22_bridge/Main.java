package ch22_bridge;

/**
 * Created by nnkwrik
 * 18/10/15 14:04
 * 桥接模式 :　将抽象部分与他的实现部分分离，使他们都可以独立的变化
 */
public class Main {
    public static void main(String[] args) {

        HandsetBrand ab = new HandsetBrandN();
        ab.setSoft(new HandsetGame());
        ab.run();

        ab.setSoft(new HandsetAddressList());
        ab.run();

        ab = new HandsetBrandM();
        ab.setSoft(new HandsetGame());
        ab.run();

        ab.setSoft(new HandsetAddressList());
        ab.run();
    }

}
