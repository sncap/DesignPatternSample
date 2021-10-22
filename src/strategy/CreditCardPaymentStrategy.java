package strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {


    private String name;
    private String ccNum;
    private String cvv;
    private String expiryDate;

    public CreditCardPaymentStrategy(String name, String ccNum, String cvv, String expiryDate) {
        this.name = name;
        this.ccNum = ccNum;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid (by credit/debit card)");
    }
}
