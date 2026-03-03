interface Payment{
    public void pay(double amount);
}

class CreditCardPay implements Payment{
    public void pay(double amount){
        System.out.println("Payment of " + amount + " using CreditCardPay ");
    }
}

class UPIPayment implements Payment{
    public void pay(double amount){
        System.out.println("Payment of " + amount + " using UPIPayment");
    }
}

public class Main1{
    public static void main(String[] args) {
        Payment p1 =new CreditCardPay();
        p1.pay(5000);
        Payment p2 = new UPIPayment();
        p2.pay(10000);
    }
}