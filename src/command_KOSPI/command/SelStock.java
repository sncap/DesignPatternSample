package command_KOSPI.command;

import command_KOSPI.receiver.Stock;

public class SelStock implements Order{
    private Stock stock;

    public SelStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void setOrder(String name, int quantity) {
        this.stock.setName(name);
        this.stock.setQuantity(quantity);
    }

    @Override
    public void execute() {
        stock.sel();
    }
}
