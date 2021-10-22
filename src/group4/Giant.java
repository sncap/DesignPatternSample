package group4;

public class Giant implements Monster {

	@Override
	public void attack(Magic magic) {
		// TODO Auto-generated method stub
		magic.visit(this);
	}

}
