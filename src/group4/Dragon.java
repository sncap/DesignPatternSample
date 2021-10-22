package group4;

public class Dragon implements Monster {


	@Override
	public void attack(Magic magic) {
		// TODO Auto-generated method stub
		magic.visit(this);
	}

}
