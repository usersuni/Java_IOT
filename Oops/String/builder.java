package String;

public class builder {
	public void stringInsert() {
		StringBuilder builder = new StringBuilder("JA");
		System.out.println("Old String : "+ builder);
		builder.insert(1,"AV");
		System.out.println("New String : "+ builder);
	}
	public void stringAppend() {
		StringBuilder builder = new StringBuilder("SNPSU ");
		System.out.println("Old String : "+ builder);
		builder.append("ISE");
		System.out.println("New String : "+ builder);
		
	}
	public void StringReverse() {
		StringBuffer builder = new StringBuffer("NOHTYP");
		System.out.println("Old String : "+ builder);
		builder.reverse();
		System.out.println("New String : "+ builder);
	}
	public static void main(String[] args) {
		new builder().stringInsert();
		new builder().stringAppend();
		new builder().StringReverse();
	}
}

