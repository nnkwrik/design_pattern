package ch18_memento;

/**
 * Created by nnkwrik
 * 18/10/15 12:50
 */
public class Role {
    private int vit = 100;

    private int atk = 100;

    private int def = 100;

    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;

    }

    public void recoveryState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }


    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void stateDisplay() {
        System.out.println("vit" + vit + ", atk" + atk + ", def" + def);
    }
}
