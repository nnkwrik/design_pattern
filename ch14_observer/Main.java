package ch14_observer;

/**
 * Created by nnkwrik
 * 18/10/11 8:53
 * 观察者模式(发布-订阅模式：定义一种一对多的依赖关系, 让多个观察者同时监听某某一个主题对象, 当这个主题状态发生变化时,通知所有观察者对象
 * 说白了就是 统一调用订阅者列表的某个方法
 */
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();

        StockObserver observer = new StockObserver("aaa",boss);
        StockObserver observer2 = new StockObserver("bbb",boss);

        boss.attach(observer);
        boss.attach(observer2);

        //发生了某些事件 ...
        boss.notification();

    }
}
