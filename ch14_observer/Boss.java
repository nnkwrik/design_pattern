package ch14_observer;

import java.util.ArrayList;

/**
 * Created by nnkwrik
 * 18/10/11 9:02
 */
public class Boss implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();
    private String action;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notification() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
