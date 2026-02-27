import java.util.*;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int n = sc.nextInt();
        int square = n * n;
        int temp = n;
        while (temp > 0) {
            if (temp % 10 != square % 10) {
                System.out.println(n + " is not an automorphic");
                return;
            }
            temp /= 10;
            square /= 10;
        }
        System.out.println(n + " an automorphic number");
    }

}
