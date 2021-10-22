package vistor_computer;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart{
    List<ComputerPart> parts = new ArrayList<>();

    public Computer() {
    }

    @Override
    public void accept(ComputerPartVisitor v) {
        for (ComputerPart p: parts ) {
            p.accept(v);
        }
    }
}
