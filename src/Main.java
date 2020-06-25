public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double creditpayment = service.calculate(1000000, 9.99, 1);
        System.out.printf(" Eжемесячный платёж, период 1 год %.0f\n", creditpayment);

        double creditpayment1 = service.calculate(1000000, 9.99, 2);
        System.out.printf(" Eжемесячный платёж, период 2 года %.0f\n", creditpayment1);

        double creditpayment2 = service.calculate(1000000, 9.99, 3);
        System.out.printf(" Eжемесячный платёж, период 3 года %.0f\n", creditpayment2);

    }
}
