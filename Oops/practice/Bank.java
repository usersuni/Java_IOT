package practice;

public class Bank {
	void interest() {
		System.out.println("Bank Provides loans");
	}
	void interest(double rate) {
		System.out.println("Rate = "+rate);
	}

}
class SBI extends Bank{
	void interest(double rate,int years) {
		double total;
		double p = 1000;
		total = (p*rate * years);
		System.out.println("total interest = "+total);
	}
}
