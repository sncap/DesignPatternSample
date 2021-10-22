package cor;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    protected int level;

    protected AbstractLogger nextLogger;
    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String msg) {
        if(this.level == level) {
            writeMessage(msg);
        } else if (nextLogger != null) {
            nextLogger.logMessage(level, msg);
        } else {
            // 처리 실패
            System.out.println(" 처리 실패 ");
        }
    }

    protected abstract void writeMessage(String msg);
}
