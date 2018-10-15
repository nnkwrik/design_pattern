package ch15_abstractFactory;

/**
 * Created by nnkwrik
 * 18/10/11 9:45
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(String department) {
        System.out.println("在　sql server　的　department表　中添加 " + department);
    }

    @Override
    public String getDepartment(int id) {
        System.out.println("在　sql server　的　department表　中取出 " + id);
        return null;
    }
}
