public class CreditPaymentService {
    public double calculate(float amount, double percent, float period) {
        double monthpercent = percent/100/12;
        double creditpayment = amount * (monthpercent + monthpercent/(Math.pow((1 + monthpercent), (period * 12) ) - 1));

        return creditpayment;
    }
}
