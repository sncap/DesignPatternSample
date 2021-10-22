package strategy;



import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	PaymentStrategy paymentStrategy;

	//List of items
	List<Item> items;

	public ShoppingCart(){
		this.items=new ArrayList<Item>();
	}

	public void addItem(Item item){
		this.items.add(item);
	}

	public void removeItem(Item item){
		this.items.remove(item);
	}

	public int calculateTotal(){
		int sum = 0;
		for(Item item : items){
			sum += item.getPrice();
		}
		return sum;
	}

	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.paymentStrategy = strategy;
	}

	public void pay(){
		int amount = calculateTotal();
//		System.out.println(amount +" paid with credit/debit card");
		paymentStrategy.pay(amount);
	}
}
