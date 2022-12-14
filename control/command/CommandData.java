package control.command;

import java.util.List;

public class CommandData {
    private List<Object> args;

    public CommandData(List<Object> args) {
        args = args;
    }

    public List<Object> getArgs() {
        return args;
    }
}
