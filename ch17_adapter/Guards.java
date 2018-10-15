package ch17_adapter;

/**
 * Created by nnkwrik
 * 18/10/15 12:29
 */
public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Guards " + name+" attack" );
    }

    @Override
    public void defense() {
        System.out.println("Guards " + name+" defense" );
    }
}
