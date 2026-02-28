package InnerClasses.memberInnerClass;

import java.sql.SQLOutput;

public class BankAccount {
    private double balance = 10000;
    //member inner class
    class Transaction{
        void withdraw(double amount){
            if(amount <= balance){
                balance -= amount;
                System.out.println("Withdrawn : "+ amount);
            }else{
                System.out.println("Insufficient Funds.");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        //outer.Inner in_Object = out_object.new Inner();
        BankAccount.Transaction t = b.new Transaction();
        t.withdraw(3000);
        t.withdraw(2000);
        System.out.println("Balance : " +b.balance);
    }
}
/*
Points to remember
transaction belongs to specific amount
Direct access to the private variable balance
Clean Encapsulation
 */
