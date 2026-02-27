package abstraction;

public interface cat1 {
	default void sound() {
		System.out.println("Meow");
	}
}
interface dog2{
	default void sound() {
		System.out.println("Barks");
	}
}
class cog implements cat1,dog2{
	public void sound() {
		dog2.super.sound();
}
}
