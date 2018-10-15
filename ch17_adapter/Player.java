package ch17_adapter;

/**
 * Created by nnkwrik
 * 18/10/15 12:28
 */
public abstract class Player {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void defense();



}
