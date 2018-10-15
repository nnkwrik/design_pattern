package ch17_adapter;

/**
 * Created by nnkwrik
 * 18/10/15 12:29
 */
public class Translator extends Player {

    private ForeignGuards fg = new ForeignGuards("ym");

    public Translator(String name) {
        super(name);
        fg.setName(name);
    }

    @Override
    public void attack() {
        fg.attack();
    }

    @Override
    public void defense() {
        fg.defense();
    }
}
