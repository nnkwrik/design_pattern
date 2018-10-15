package ch26_Flyweight;

/**
 * Created by nnkwrik
 * 18/10/15 15:32
 * 享元模式　：运用共享技术有效的支持大量细粒度的对象. 能大大减少实例总数．但是维护享元列表也需要一定资源
 */
public class Main {

    public static void main(String[] args) {
        WebSiteFactory f = new WebSiteFactory();

        WebSite a = f.getWebSiteCategory("商城");
        a.use(new User("a"));

        WebSite b = f.getWebSiteCategory("商城");
        a.use(new User("b"));

        System.out.println(a == b);

        WebSite c = f.getWebSiteCategory("博客");
        a.use(new User("c"));

        WebSite d = f.getWebSiteCategory("博客");
        a.use(new User("d"));
    }
}
