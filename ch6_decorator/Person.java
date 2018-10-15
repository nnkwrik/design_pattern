package ch6_decorator;

/**
 * Created by nnkwrik
 * 18/10/10 18:11
 */
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.print(name + " is wearing :");
    }
}
