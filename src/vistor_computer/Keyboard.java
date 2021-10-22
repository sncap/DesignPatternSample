package vistor_computer;

public class Keyboard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
}
