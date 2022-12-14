package control.memento;

public interface Restorable {
    public Memento createMemento();

    public void restoreMemento(Memento m);
}
