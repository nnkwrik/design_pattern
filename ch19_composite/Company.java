package ch19_composite;

/**
 * Created by nnkwrik
 * 18/10/15 13:14
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company c);
    public abstract void remove(Company c);
    public abstract void display(int depth);
    public abstract void lineOfDuty();
}
