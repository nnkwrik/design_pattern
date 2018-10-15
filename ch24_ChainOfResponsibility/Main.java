package ch24_ChainOfResponsibility;

/**
 * Created by nnkwrik
 * 18/10/15 14:50
 * 责任链模式　：使多个对象都有机会处理请求,从而避免接受者之间的耦合关系
 * 将这个对象形成一条链, 并沿着这条链传递该请求.知道有一个对象处理它为止
 */
public class Main {
    public static void main(String[] args) {
        CommonManager jingli = new CommonManager("jingli");
        Majordomo zongjian = new Majordomo("zongjian");
        GeneralManager zongjingli = new GeneralManager("zongjingli");

        jingli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        jingli.requestApplication("请病假");
        jingli.requestApplication("回老家");
        jingli.requestApplication("加薪");
    }
}
