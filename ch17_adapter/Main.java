package ch17_adapter;

/**
 * Created by nnkwrik
 * 18/10/15 12:15
 * 适配器模式 :　将一个类的借口转换成用户希望的另一个接口．是的原本不兼容的类能一起工作
 * 说白了就是调用接口的对象, 而该对象是调用了和该接口无关的类,
 */
public class Main {
    public static void main(String[] args) {
        Player b = new Forwards("FF");
        b.attack();
        Player m = new Center("CC");
        m.attack();
//        Player y = new Guards("GG");
        Player y = new Translator("YM");
        y.attack();
        y.defense();
    }
}
