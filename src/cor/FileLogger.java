package cor;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("File Logger ["+level+"] " + msg);
    }
}
