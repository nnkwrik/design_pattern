package ch28_visitor;

/**
 * Created by nnkwrik
 * 18/10/15 16:32
 */
public abstract class Action {
    public abstract void getManConclusion(Man concreteElementA);
    public abstract void getWomanConclusion(Woman concreteElementB);
}
