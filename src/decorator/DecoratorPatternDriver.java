package decorator;


public class DecoratorPatternDriver {

    public static void main(String[] args) {
        // christmas tree with just one Garland

        ChristmasTree tree = new ChristmasTreeImpl();

        ChristmasTree garland = new Garland(tree);

        garland = new Garland(garland);
        garland = new BubbleLights(garland);

        System.out.println(garland.decorate());

        // christmas tree with two Garlands and one Bubble lights


    }

}
