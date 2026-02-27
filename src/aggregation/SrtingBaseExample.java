package aggregation;

public class SrtingBaseExample {
	public static void main(String[] args) {
		char[]letters={'S','U','N','I'};
		String name = new String(letters);
		System.out.println(name);
		String jumble = "Sunil1Akash1Nithin1Tharun";
		String[] words = jumble.split("1");
		System.out.println(words[0]);
		for(Object o : words) {
			System.out.print(o + " ");
		}
	}

}
