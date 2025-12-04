public class BankTransferPaymenFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new BankTransferPayment();
    }
}
