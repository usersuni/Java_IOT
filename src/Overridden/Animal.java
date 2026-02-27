package Overridden;

public class Animal {
	 void sound() {
		System.out.println("Animal makes sound");
	}

}
class dog extends Animal{
	void sound() {
		super.sound();
		System.out.println("Dog barks");
	}
}
