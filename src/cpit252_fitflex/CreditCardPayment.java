package cpit252_fitflex;


class CreditCardPayment implements PaymentStrategy {

    @Override
    public String pay(double amount) {
        return "Paid " + amount + " SAR via Credit Card";
    }
}
