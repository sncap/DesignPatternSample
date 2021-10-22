package cor;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Error Logger ["+level+"] " + msg);
    }
}
