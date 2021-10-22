package decorator_MSG;

public class SmsNoti extends AlertType{
    public SmsNoti(Notifier noti) {
        super(noti);
    }

    public String notifys() {
        return super.notifys() + sendSMS();
    }

    public String sendSMS() {
        return " send SMS ";
    }
}
