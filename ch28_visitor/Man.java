package ch28_visitor;

/**
 * Created by nnkwrik
 * 18/10/15 16:34
 */
public class Man extends Person {
    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
