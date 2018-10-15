package ch13_builder;

/**
 * Created by nnkwrik
 * 18/10/10 20:42
 */
public class PersonDirector {

    private PersonBuilder pb;
    public PersonDirector(PersonBuilder pb) {
        this.pb = pb;
    }

    public void createPerson(){
        pb.buildHead();
        pb.buildBody();
        pb.buildArm();
        pb.buildLeg();
    }

}
