import java.util.*;

public class binary {
    public static int no_bits(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        System.out.println("Number of counts = " + no_bits(n));
        sc.close();
    }
}
