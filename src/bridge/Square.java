package bridge;

public class Square extends Shape{

    public Square(Color color) {
        super(color);
        //super(new Red());
    }

    @Override
    public String draw() {
        return "Draw Square : " +  color.fill();
    }
}
