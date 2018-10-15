package ch26_Flyweight;

/**
 * Created by nnkwrik
 * 18/10/15 15:40
 */
public class ConcreteWebSite extends WebSite {

    private String name = "";

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类 : " + name +" 用户 : "+user);
    }
}
