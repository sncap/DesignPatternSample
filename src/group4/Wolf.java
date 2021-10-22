package group4;

public class Wolf implements Monster {

	@Override
	public void attack(Magic magic) {
		// TODO Auto-generated method stub
		magic.visit(this);
	}

}
