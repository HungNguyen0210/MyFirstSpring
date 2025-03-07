package codes.mySpringProject;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public OrderService(){

    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
