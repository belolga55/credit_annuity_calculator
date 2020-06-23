public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        float creditpayment = service.calculate (1000000, 9.99, 1);
        System.out.println(" Eжемесячный платёж = " + creditpayment);


        float creditpayment1 = service.calculate (1000000, 9.99, 2);
        System.out.println(" Eжемесячный платёж = " + creditpayment1);

        float creditpayment2 = service.calculate (1000000, 9.99, 3);
        System.out.println(" Eжемесячный платёж = " + creditpayment2);

    }
}
