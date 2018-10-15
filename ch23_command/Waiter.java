package ch23_command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nnkwrik
 * 18/10/15 14:40
 */
public class Waiter {
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
        commands.add(command);

    }

    public void notification() {
        for (Command command : commands) {

            command.excuteCommand();
        }
        commands.clear();
    }
}
