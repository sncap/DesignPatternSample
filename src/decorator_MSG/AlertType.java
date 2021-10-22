package decorator_MSG;

public class AlertType implements Notifier{
    private Notifier noti;

    public AlertType(Notifier noti) {
        this.noti = noti;
    }

    @Override
    public String notifys() {
        return noti.notifys();
    }
}
