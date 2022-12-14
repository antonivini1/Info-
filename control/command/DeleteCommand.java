package control.command;

import control.Service;

public class DeleteCommand implements Command {
    private Service service;

    public DeleteCommand(Service service) {
        this.service = service;
    }
    @Override
    public void execute(CommandData data) {
        service.delete(data);
    }
}
