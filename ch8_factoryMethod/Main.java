package ch8_factoryMethod;

/**
 * Created by nnkwrik
 * 18/10/10 18:36
 * 工厂方法模式 : 定义一个用于创建对象的接口, 让子类决定实例化哪一个类.工厂方法使一个类的实例化延迟到其子类
 */
public class Main {
    public static void main(String[] args) {

        //简单工厂模式, 需要多个工具的实例, 因此导致student出现了两遍, -->造一个工厂的工厂
//        Leifeng studentA = SimpleFactory.createLeifeng("student");
//        studentA.buyRice();
//        Leifeng studentB = SimpleFactory.createLeifeng("student");
//        studentB.sweep();

        IFactory factory = new StudentFactory();
        Leifeng studentA = factory.createLeiFeng();
        Leifeng studentB = factory.createLeiFeng();
        studentA.buyRice();
        studentB.sweep();


    }
}
