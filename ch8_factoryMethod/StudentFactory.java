package ch8_factoryMethod;

/**
 * Created by nnkwrik
 * 18/10/10 19:35
 */
public class StudentFactory implements IFactory {

    @Override
    public Leifeng createLeiFeng() {
        return new Student();
    }
}
