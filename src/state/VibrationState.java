package state;

public class VibrationState extends AlertState {
    @Override
    public void alert() {
        System.out.println("Vibration");
    }

    @Override
    public AlertState nextState() {
        return new SilentState();
    }
}
