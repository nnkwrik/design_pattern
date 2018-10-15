package ch24_ChainOfResponsibility;

/**
 * Created by nnkwrik
 * 18/10/15 15:04
 */
public abstract class Manager {
    protected String name;

    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplication(String request);
}
