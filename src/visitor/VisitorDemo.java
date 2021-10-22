package visitor;

import java.util.UUID;

public class VisitorDemo {

    public static void main(String[] args) {

        Visitor v = new ElementVisitor();

        Document d = new Document(generateUuid());
        d.elements.add(new JsonElement(generateUuid()));
        d.elements.add(new JsonElement(generateUuid()));
        d.elements.add(new XmlElement(generateUuid()));

        d.accept(v);

        d.accept(new PrintVistor());
    }

    private static String generateUuid() {
        return UUID.randomUUID()
            .toString();
    }
}
