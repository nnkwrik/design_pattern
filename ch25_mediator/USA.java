package ch25_mediator;

/**
 * Created by nnkwrik
 * 18/10/15 15:23
 */
public class USA extends Country {
    public USA(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        mediator.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("USA get message : " + message);
    }
}
