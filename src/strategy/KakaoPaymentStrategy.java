package strategy;

public class KakaoPaymentStrategy implements PaymentStrategy{

    private String id;
    private String password;

    public KakaoPaymentStrategy(String id, String password) {
        this.id = id;
        this.password = password;
    }


    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid by KAKAO ");
    }
}
