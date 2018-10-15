package ch13_builder;

/**
 * Created by nnkwrik
 * 18/10/10 20:38
 */
public class PersonThinBuilder extends PersonBuilder {
    public PersonThinBuilder(String paper, String pen) {
        super(paper, pen);
    }

    @Override
    public void buildHead() {
        System.out.println("draw thin head with " + pen + " and " + paper);
    }

    @Override
    public void buildBody() {
        System.out.println("draw thin body with " + pen + " and " + paper);
    }

    @Override
    public void buildArm() {
        System.out.println("draw thin arm with " + pen + " and " + paper);
    }

    @Override
    public void buildLeg() {
        System.out.println("draw thin leg with " + pen + " and " + paper);
    }
}
