package ch23_command;

/**
 * Created by nnkwrik
 * 18/10/15 14:36
 */
public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    public abstract void excuteCommand();

}
