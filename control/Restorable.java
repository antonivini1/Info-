package control;

public interface Restorable {
    public Memento createMemento();

    public void restoreMemento(Memento m);
}
