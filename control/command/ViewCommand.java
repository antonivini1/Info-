package control.command;

import control.Service;
import control.visitor.EntityPrinter;
import jdk.nashorn.internal.ir.debug.PrintVisitor;

public class ViewCommand implements Command {
    private Service service;

    public ViewCommand(Service service) {
        this.service = service;
    }
    @Override
    public void execute(CommandData data) {
        service.viewAll(new EntityPrinter());
    }
}
