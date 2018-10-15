package ch9_prototype;

/**
 * Created by nnkwrik
 * 18/10/10 19:39
 * 原型模式 :　用原型实例制定创建对象的种类，　并且通过拷贝这些原型创建新的对象
 */
public class Main {
    public static void main(String[] args) {
        Resume tom = new Resume("tom");
        tom.setPersonalInfo("m","18");
        tom.setWorkExperience("2018","companyA");

        Resume tom2 = (Resume) tom.clone();
        tom2.setWorkExperience("2017","companyB");

        tom.display();
        tom2.display();


    }


}
