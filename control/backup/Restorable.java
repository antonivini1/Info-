package control.backup;

import control.backup.Memento;

public interface Restorable {
    public Memento createMemento();

    public void restoreMemento(Memento m);
}
