package command_KOSPI.receiver;

public class Stock {
    private String name = "stock";
    private int quantity;

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void buy(){
        System.out.println("Buy : "+ name + " Stock ," +  quantity + " cnt");
    }

    public void sel() {
        System.out.println("Sell : "+ name + " Stock ," + quantity + " cnt");
    }
}
