package ch23_command;

/**
 * Created by nnkwrik
 * 18/10/15 14:28
 * 命令模式　：　将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化．　
 * 队请求排队或记录请求日志，以及支持可撤销的操作
 */
public class Main {

    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenCommand = new BakeChickenCommand(boy);
        Waiter girl = new Waiter();

        girl.setCommand(bakeMuttonCommand1);

        girl.setCommand(bakeMuttonCommand2);

        girl.setCommand(bakeChickenCommand);
        girl.notification();



    }
}

