package ch18_memento;

/**
 * Created by nnkwrik
 * 18/10/15 12:42
 * 备忘录模式 :　在不破坏封装的前提下，　捕获一个对象的内部状态，　并在该对象之外保存这个状态，以便后期恢复到这个状态
 * Origignator, 创造备份　和　还原备份
 * Memento : 备份，　类似于实体类
 * Caretaker　：　保存Origignatoｒ创造的备份
 */
public class Main {

    public static void main(String[] args) {
        Role rink = new Role();
        rink.stateDisplay();

        RoleStateCaretaker keep = new RoleStateCaretaker();
        RoleStateMemento memento = rink.saveState();
        keep.setMemento(memento);

        rink.fight();
        rink.stateDisplay();

        rink.recoveryState(keep.getMemento());
        rink.stateDisplay();

    }

}
