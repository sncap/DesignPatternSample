package state;

public abstract class AlertState {
    public abstract void alert();
    public abstract AlertState nextState();

}
