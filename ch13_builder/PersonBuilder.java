package ch13_builder;

/**
 * Created by nnkwrik
 * 18/10/10 20:37
 */
public abstract class PersonBuilder {
    protected String paper;
    protected String pen;

    public PersonBuilder(String paper, String pen) {
        this.paper = paper;
        this.pen = pen;
    }

    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildArm();
    public abstract void buildLeg();


}
