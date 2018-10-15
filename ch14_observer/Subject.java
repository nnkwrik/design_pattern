package ch14_observer;

/**
 * Created by nnkwrik
 * 18/10/11 8:59
 */
public interface Subject {

    String subjectState = null;
    void attach(Observer observer);
    void detach(Observer observer);
    void notification();

}
