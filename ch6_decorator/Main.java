package ch6_decorator;

/**
 * Created by nnkwrik
 * 18/10/10 18:07
 * 装饰模式 : 动态地给一个对象添加一些额外的职责,就添加功能来说, 装饰模式比生成子类更为灵活
 * 一层层, 子类(Decorator)中又包括父类(Component)的对象, 类似嵌套;
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("a guy");
        TShirts tShirts = new TShirts();
        Trouser trouser = new Trouser();

        tShirts.decorate(person);
        trouser.decorate(tShirts);

        trouser.show();
    }
}
