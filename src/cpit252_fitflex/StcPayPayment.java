package cpit252_fitflex;


public class StcPayPayment implements PaymentStrategy {

    @Override
    public String pay(double amount) {
        return "Paid " + amount + " SAR via Stc Pay";
    }
}
