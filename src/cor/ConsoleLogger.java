package cor;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Console Logger ["+level+"] " + msg);
    }
}
