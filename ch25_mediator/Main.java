package ch25_mediator;

/**
 * Created by nnkwrik
 * 18/10/15 15:14
 * 中介者模式 :　用一个中介对象来封装一系列的对象交互．
 * 中介者使各个对象不需要显示的相互引用，从而使其二和松散，而且可以独立的改变他们之间的交互
 */
public class Main {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();

        USA c1 = new USA(UNSC);
        Iraq c2 = new Iraq(UNSC);

        UNSC.setColleague1(c1);
        UNSC.setColleague2(c2);

        c1.declare("hi, i am usa");
        c2.declare("hi, i am iraq");


    }
}
