package controller;

/**
 * Created by Elimane on Apr, 2020, at 07:35
 */
public class PaypalAlgorithm implements Payment{

    private String email;
    private String password;

    public PaypalAlgorithm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid with Paypal");
    }
}
