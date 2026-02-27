package abstraction;

public interface Animal1 {
	void sound();
	void run();
}
class Cat implements Animal1{
	public void sound() {
		System.out.println("Cat meow");
	}
	public void run() {
		System.out.println("Cat run fast");
	}
}

class Dog implements Animal1{
	public void sound() {
		System.out.println("DOg barks");
	}
	public void run() {
		System.out.println("Dog also run fast");
	}
}

