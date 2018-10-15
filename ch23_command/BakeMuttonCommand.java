package ch23_command;

/**
 * Created by nnkwrik
 * 18/10/15 14:38
 */
public class BakeMuttonCommand extends Command {


    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeMutton();

    }
}
