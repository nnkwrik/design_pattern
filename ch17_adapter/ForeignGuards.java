package ch17_adapter;

/**
 * Created by nnkwrik
 * 18/10/15 12:29
 */
public class ForeignGuards {
    protected String name;

    public ForeignGuards(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("Guards " + name + " attack");
    }


    public void defense() {
        System.out.println("Guards " + name + " defense");
    }
}
