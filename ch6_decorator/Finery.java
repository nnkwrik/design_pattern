package ch6_decorator;

/**
 * Created by nnkwrik
 * 18/10/10 18:14
 */
public class Finery extends Person {

    protected Person component;


    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
