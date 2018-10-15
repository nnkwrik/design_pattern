package ch13_builder;

/**
 * Created by nnkwrik
 * 18/10/10 20:28
 * 建造者模式　：　将一个复杂对象的构建与他的表示分离，　使得同样的构建过程可以创建不同的表示
 * factory 是创建一个工具　，　Builder是规定了流程
 */
public class Main {

    public static void main(String[] args) {
        PersonThinBuilder ptb = new PersonThinBuilder("normal paper", "red pen");
        PersonDirector director = new PersonDirector(ptb);
        director.createPerson();
    }
}
