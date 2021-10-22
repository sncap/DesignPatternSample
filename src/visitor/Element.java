package visitor;

public abstract class Element {

    public String uuid;
    private String name;
    
    public String getName() {
    	return name;
    }

    public Element(String uuid) {
        this.uuid = uuid;
    }

    public abstract void accept(Visitor v);
}