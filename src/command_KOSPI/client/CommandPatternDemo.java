package command_KOSPI.client;

import command_KOSPI.command.BuyStock;
import command_KOSPI.command.Order;
import command_KOSPI.command.SelStock;
import command_KOSPI.invoker.Broker;
import command_KOSPI.receiver.Stock;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Order buyOrder = new BuyStock(stock);
        Order selOrder = new SelStock(stock);
        Broker broker = new Broker();

        buyOrder.setOrder("Samsung",123);
        broker.takeOrder(buyOrder);
        buyOrder.setOrder("SDS",12);
        broker.takeOrder(buyOrder);
        selOrder.setOrder("SDS",10);
        broker.takeOrder(selOrder);
        buyOrder.setOrder("SDS",11);
        broker.takeOrder(buyOrder);
        buyOrder.setOrder("Samsung",123);
        broker.takeOrder(selOrder);

        broker.placeOrders();
    }
}
