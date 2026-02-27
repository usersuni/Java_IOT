package practice;

public class Vehicle {
	void speed() {
		System.out.println("Car is speed");
	}
	void speed(int maxSpeed) {
		System.out.println("Maximum speed of the vehicle = "+maxSpeed);
	}

}
class car extends Vehicle{
	void speed(String mode) {
		System.out.println("Mode = " + mode);
	}
}