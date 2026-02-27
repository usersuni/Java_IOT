package String;

public class BufferBuilderPerformance {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer("JAVA");
		for(int i = 1;i<100000;i++) {
			buffer.append("DSA");
		}
		System.out.println("Buffer time : "+ (System.currentTimeMillis() - startTime)+ "ms");
		startTime = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder("JAVA");
		for(int i = 1;i<100000;i++) {
			builder.append("DSA");
		}
		System.out.println("Builder time : "+ (System.currentTimeMillis() - startTime)+ "ms");
	}
}
