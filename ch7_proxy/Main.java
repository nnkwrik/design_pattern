package ch7_proxy;

/**
 * Created by nnkwrik
 * 18/10/10 18:26
 * 代理模式 : 为其他对象提供一种代理以控制对这个对象的访问
 */
public class Main {
    public static void main(String[] args) {

        String girl = "pretty girl";

        Proxy proxy = new Proxy(girl);

        proxy.giveMoney();
        proxy.giveCar();
        proxy.giveHouse();
    }
}
