package ch6_decorator;

/**
 * Created by nnkwrik
 * 18/10/10 18:17
 */
public class Trouser extends Finery {
    @Override
    public void show() {

        super.show();
        System.out.print(" Trouser,");
    }
}
