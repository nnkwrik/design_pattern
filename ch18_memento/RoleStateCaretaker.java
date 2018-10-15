package ch18_memento;

/**
 * Created by nnkwrik
 * 18/10/15 12:54
 */
public class RoleStateCaretaker {
    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
