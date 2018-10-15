package ch14_observer;

/**
 * Created by nnkwrik
 * 18/10/11 9:06
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(name+"关闭股票行情, 继续工作!");
    }
}
