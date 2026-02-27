package abstraction;

interface sports{
	void play();
}
class person{
	String name;
	person(String name){
		this.name=name;
	}
}
public class student extends person implements sports {

	student(String name) {
		super(name);
	}
	public void play() {
		System.out.println(name + " Play cricket");
	}

}
