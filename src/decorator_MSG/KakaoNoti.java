package decorator_MSG;

public class KakaoNoti extends AlertType{
    public KakaoNoti(Notifier noti) {
        super(noti);
    }

    public String notifys() {
        return super.notifys() + sendKakao();
    }

    public String sendKakao() {
        return " send Kakao 메시지";
    }
}
