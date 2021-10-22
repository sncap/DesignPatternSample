package group4;

public class BlindMagic implements Magic{
    @Override
    public void visit(Giant giant) {
        System.out.println("거인은 눈이 보이지 않습니다");
    }

    @Override
    public void visit(Dragon dragon) {
        System.out.println("용은 눈이 보이지 않습니다.");
    }

    @Override
    public void visit(Wolf wolf) {
        System.out.println("늑대의 눈이 멀었지만 냄새를 맡습니다");
    }

    @Override
    public void visit(WolfGroup wolfGroup) {
        System.out.println("늑대 그룹에게 블라인드 마법을 사용합니다.");
    }
}
