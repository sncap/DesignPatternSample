package command_KOSPI.invoker;

import command_KOSPI.command.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order od: orders) {
            od.execute();
        }

        orders.clear();
    }
}
