public class crediCardFactory implements PaymentFactory {
    public Payment createPayment() {
        return new creditCardPayment();
    }
}
