package ch28_visitor;

/**
 * Created by nnkwrik
 * 18/10/15 16:33
 */
public class Failing extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + this.getClass().getSimpleName()+"时，打游戏");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + this.getClass().getSimpleName()+"时，吃零食");

    }
}
