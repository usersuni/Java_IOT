package super_Keyword;

public class child extends parent {
	int x = 20;
	void show() {
		System.out.println(x);
		System.out.println(super.x);
	}
	child(){
		super();
		System.out.println("Child");
	}

	public static void main(String[] args) {
		child ob=new child();
		ob.show();
	}

}
