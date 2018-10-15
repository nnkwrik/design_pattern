package ch2_strategy;

/**
 * Created by nnkwrik
 * 18/10/10 18:02
 *  * 策略模式：　和简单工厂不同，　不是返回工具，　而是把工具放入Ｃｏｎｔｅｘｔ中，客户端直接取结果
 *  * 客户端直接放入自己需要那种算法的类，　而不是工厂通过case判断
 *  可以和简单工厂模式结合使用, 在Context类中放个case,客户端同样输入字符串
 */
public class Main {
    public static void main(String[] args) {



        CashContext cc = new CashContext(new CashRebate("0.8"));

        double result = cc.getResult(100);

        System.out.println(result);

    }
}
