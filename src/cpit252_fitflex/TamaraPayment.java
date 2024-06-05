package cpit252_fitflex;


public class TamaraPayment implements PaymentStrategy {

    @Override
    public String pay(double amount) {
        //Split in 4 payments of SAR ... No interest. No late fees.
        return "Paid " + amount / 4 + " SAR via Tamara";
    }
}
