package group4;

public class FrozenMagic implements Magic{
    @Override
    public void visit(Giant giant) {
        System.out.println("거인은 발이 묶였습니다.");
    }

    @Override
    public void visit(Dragon dragon) {
        System.out.println("용은 프로즌 마법이 통하지 않습니다.");
    }

    @Override
    public void visit(Wolf wolf) {
        System.out.println("늑대는 발이 묶였습니다.");
    }

    @Override
    public void visit(WolfGroup wolfGroup) {
        System.out.println("늑대 무리에게 프로즌 마법을 사용하였습니다.");
    }
}
