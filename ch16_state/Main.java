package ch16_state;

/**
 * Created by nnkwrik
 * 18/10/11 10:06
 * 状态模式:当一个对象的内在状态改变时允许改变其行为, 这个对象看起来像是改变了其类
 * 把复杂的if else简单化, 在客户端直接放入该状态对应的行为的类? 而不是进行ifelse判断
 * 当一个对象的行为取决与他的状态, 依然是想ifelse那样从前开始判断, 不符合时放入下一个状态
 */
public class Main {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();

        work.setHour(18);
        work.setFinish(true);
        work.writeProgram();
    }
}
