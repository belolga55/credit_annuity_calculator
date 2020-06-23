public class CreditPaymentService {
    public float calculate(float amount, float percent, float period) {
        float monthpercent = percent/100/12;
        float creditpayment = amount * (monthpercent + monthpercent/(Math.pow((1 + monthpercent), (period * 12)) - 1);

        return creditpayment;
    }
}
