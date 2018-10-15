package ch8_factoryMethod;

/**
 * Created by nnkwrik
 * 18/10/10 19:35
 */
public class VolunteerFactory implements IFactory {

    @Override
    public Leifeng createLeiFeng() {
        return new Volunteer();
    }
}
