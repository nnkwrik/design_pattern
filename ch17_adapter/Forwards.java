package ch17_adapter;

/**
 * Created by nnkwrik
 * 18/10/15 12:29
 */
public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("forward " + name+" attack" );
    }

    @Override
    public void defense() {
        System.out.println("forward " + name+" defense" );
    }
}
