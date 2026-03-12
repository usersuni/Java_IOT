package BitManipulations;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if((n & (n - 1)) == 0){
            System.out.println( n + " is a power of 2");
        }else{
            System.out.println(n + " not a power of two");
        }
    }
}
