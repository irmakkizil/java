public class Main {
    public static void main(String[] args) {
        PaymentFactory bankTransferFactory=new BankTransferPaymenFactory();
        PaymentFactory crediCardFactory=new crediCardFactory();

        Payment bankTransferPayment=bankTransferFactory.createPayment();
        bankTransferPayment.processPayment();

        Payment creditCardPayment=crediCardFactory.createPayment();
        creditCardPayment.processPayment();
    }
}