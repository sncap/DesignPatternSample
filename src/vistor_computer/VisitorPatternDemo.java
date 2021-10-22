package vistor_computer;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPartVisitor v = new ComputerPartDisplayVisitor();

        Computer computer = new Computer();

        computer.parts.add(new Keyboard());
        computer.parts.add(new Monitor());
        computer.parts.add(new Monitor());

        computer.accept(v);

    }
}
