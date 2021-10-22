package state;

public class SilentState extends AlertState {
    @Override
    public void alert() {
        System.out.println("Silent");
    }

    @Override
    public AlertState nextState() {
        return new BellState();
    }
}
