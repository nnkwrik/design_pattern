package ch23_command;

/**
 * Created by nnkwrik
 * 18/10/15 14:38
 */
public class BakeChickenCommand extends Command {


    public BakeChickenCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeChickenWing();

    }
}
