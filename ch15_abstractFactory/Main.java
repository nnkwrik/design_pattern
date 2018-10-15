package ch15_abstractFactory;

/**
 * Created by nnkwrik
 * 18/10/11 9:21
 * 抽象工厂模式 :　提供一个创建一系列相关或互相依赖对象的接口，　而无需指定他们具体的类
 * 抽象工厂中调用相应的普通工厂(如果需求是sqlserver, 那么sqlserver的抽象工厂，会自动调用生产sqlserver语法的工厂)，
 * 　让客户端的使用过程变得更抽象
 */
public class Main {

    public static void main(String[] args) {
        String user = "user";
        String depertment = "depertment";

        IFactory factory = new SqlServerFactory();

        IUser iu = factory.createUser();
        iu.insert(user);
        iu.getUser(1);

        IDepartment id = factory.createDep();
        id.insert(depertment);
        id.getDepartment(1);
    }
}
