package ch15_abstractFactory;

/**
 * Created by nnkwrik
 * 18/10/11 9:45
 */
public class SqlserverUser implements IUser {
    @Override
    public void insert(String user) {
        System.out.println("在　Sqlserver　的　user表　中添加 " + user);
    }

    @Override
    public String getUser(int id) {
        System.out.println("在　Sqlserver　的　user表　中取出 " + id);
        return null;
    }
}
