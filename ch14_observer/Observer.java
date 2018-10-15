package ch14_observer;

/**
 * Created by nnkwrik
 * 18/10/11 9:00
 */
public abstract class Observer {

    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
