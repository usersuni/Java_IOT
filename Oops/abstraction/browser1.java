package abstraction;

public interface browser1 {
	void b1();
}
interface b2{
	void b2();
}
interface b3{
void b3();
}

class browser implements browser1 ,b2,b3 {
	public void b1() {
		System.out.println("Chrome");
	}
	public void b2() {
		System.out.println("FireFox");
	}
	public void b3() {
		System.out.println("Edge");
	}
}

