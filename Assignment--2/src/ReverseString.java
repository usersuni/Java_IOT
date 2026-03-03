public class ReverseString {
    public static void main(String[] args) {
        String str = "Java Script";

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();
        System.out.println("Original String : "+str);
        System.out.println("Reverse string : "+sb);
    }
}
