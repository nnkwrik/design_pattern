package ch10_template;

/**
 * Created by nnkwrik
 * 18/10/10 20:06
 * 模板方法模式　：定义一个操作中的算法的骨架, 而将一些步骤延迟到子类中, 从而使得子类可以不改变一个算法的结构即可重新定义某些步骤
 */
public class Main {
    public static void main(String[] args) {

        TestPaper A = new TestPaperA();
        A.question1();
        A.question2();
        A.question3();

        System.out.println("----------");

        TestPaper B = new TestPaperB();
        B.question1();
        B.question2();
        B.question3();
    }


}
