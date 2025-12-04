public class paypalPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.printf("paypal işlemi gerçekleştirilfi");
    }
}
