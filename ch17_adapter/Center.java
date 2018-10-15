package ch17_adapter;

/**
 * Created by nnkwrik
 * 18/10/15 12:29
 */
public class Center extends Player {
    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Center " + name+" attack" );
    }

    @Override
    public void defense() {
        System.out.println("Center " + name+" defense" );
    }
}
