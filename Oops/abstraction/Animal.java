package abstraction;

abstract class Animal {
	void eat() {
		System.out.println("Animal is a Nov veg");
		}
	
	abstract void run();

}

class cat extends Animal{
	void run() {
		System.out.println("Cats are very brave");
	}
}

class dog extends Animal{
	void run() {
		System.out.println("Dog barks");
	}
}
