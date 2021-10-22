package command_KOSPI.command;

public interface Order {

    public void setOrder(String name, int quantity);
    public void execute();
}
