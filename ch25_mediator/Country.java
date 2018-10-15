package ch25_mediator;

/**
 * Created by nnkwrik
 * 18/10/15 15:22
 */
public class Country {

    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
}
