package aggregation;

public class engine {
	void start() {
		System.out.println("car start");
	}
}
 class Car{
	private engine e;
	Car(){
		engine e = new engine();
	}
	void drive() {
		e.start();
		System.out.println("Car is moving");
	}
 }
