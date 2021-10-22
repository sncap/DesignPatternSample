package state;

public class BellState extends AlertState {
    @Override
    public void alert() {
        System.out.println("Ring Bell");
    }

    @Override
    public AlertState nextState() {

        return new VibrationState();
    }
}
