package InnerClasses.anonymous;

public interface Payment {
    void pay();
}
class PaymentDemo{
    public static void main(String[] args) {
        Payment p = new Payment(){
            public void pay(){
                System.out.println("Payment done using Credit Card.");
            }
        };
        p.pay();
        //SCALA - JAVA 8 (Streams, Annotations, Lambdas, Reflection)
        Payment p1 = () -> System.out.println("Cash Payment");
        p1.pay();
    }
}
