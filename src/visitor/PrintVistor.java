package visitor;

public class PrintVistor implements Visitor{
    @Override
    public void visit(XmlElement xe) {
        System.out.println("Print XML " + xe.uuid);
    }

    @Override
    public void visit(JsonElement je) {
        System.out.println("Print JSON " + je.uuid);
    }
}
