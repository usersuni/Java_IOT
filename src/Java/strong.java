import java.util.*;

public class strong {
    int factorial(int d) {
        int fact = 1;
        for (int i = 1; i <= d; i++) {
            fact = fact * i;
        }
        return fact;
    }

    boolean isStrong(int n) {// 45
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum = sum + factorial(d);
            n = n / 10;
        }
        if (sum == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        strong ob = new strong();
        Scanner ob1 = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = ob1.nextInt();
        if (ob.isStrong(n)) {
            System.out.println(n + " is a Strong number");
        } else {
            System.out.println(n + " is not a Strong number");
        }
        ob1.close();
    }

}
