package cpit252_fitflex;


public class ApplePayPayment implements PaymentStrategy {

    @Override
    public String pay(double amount) {
        return "Paid " + amount + " SAR via Apple Pay";
    }
}
