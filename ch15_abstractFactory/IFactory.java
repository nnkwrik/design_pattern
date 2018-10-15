package ch15_abstractFactory;

/**
 * Created by nnkwrik
 * 18/10/11 9:47
 */
public interface IFactory {
    IUser createUser();

    IDepartment createDep();
}
