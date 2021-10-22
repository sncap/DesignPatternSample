package state;

public class AlertController {
	private AlertState state;

	public AlertController() {
		this.state = new BellState();
	}

	public void setState(AlertState state) {
		this.state = state;

	}


	public void alert() {
		// TODO Auto-generated method stub
		state.alert();
	}

	public void switchMode() {
		// TODO Auto-generated method stub
		this.state = state.nextState();
	}

}
