package decorator_MSG;

public class NotiDemo {
    public static void main(String[] args) {
        Notifier noti = new NotifierImpl();

        AlertType alert = new AlertType(noti);

        System.out.println(alert.notifys());

        alert = new SmsNoti(noti);
        System.out.println(alert.notifys());

        alert = new KakaoNoti(noti);
        System.out.println(alert.notifys());

        alert = new AlertType(noti);
        alert = new SmsNoti(alert);
        alert = new KakaoNoti(alert);
        System.out.println(alert.notifys());
    }
}
