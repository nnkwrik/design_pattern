package ch28_visitor;

/**
 * Created by nnkwrik
 * 18/10/15 16:33
 */
public abstract class Person {
    public abstract void accept(Action visitor);
}
