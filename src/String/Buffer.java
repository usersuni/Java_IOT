package String;

public class Buffer {
	public void stringInsert() {
		StringBuffer buffer = new StringBuffer("JA");
		System.out.println("Old String : "+ buffer);
		buffer.insert(1,"AV");
		System.out.println("New String : "+ buffer);
	}
	public void stringAppend() {
		StringBuffer buffer = new StringBuffer("SNPSU ");
		System.out.println("Old String : "+ buffer);
		buffer.append("ISE");
		System.out.println("New String : "+ buffer);
		
	}
	public void StringReverse() {
		StringBuffer buffer = new StringBuffer("NOHTYP");
		System.out.println("Old String : "+ buffer);
		buffer.reverse();
		System.out.println("New String : "+ buffer);
	}
	public static void main(String[] args) {
		new Buffer().stringInsert();
		new Buffer().stringAppend();
		new Buffer().StringReverse();
	}
}

