package state;

public class MobilePhoneDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertController alerter = new AlertController();
		alerter.setState(new BellState());
		
		//bell
		alerter.alert();
		alerter.switchMode();
			
		//vibration
		alerter.alert();
		alerter.switchMode();
		
		//silent
		alerter.alert();
		alerter.switchMode();
		
		//bell
		alerter.alert();
	}

}
