package ch15_abstractFactory;

/**
 * Created by nnkwrik
 * 18/10/11 9:50
 */
public class SqlServerFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDep() {
        return new SqlServerDepartment();
    }
}
