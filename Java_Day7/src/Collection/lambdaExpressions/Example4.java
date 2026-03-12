package Collection.lambdaExpressions;

import java.util.ArrayList;

//Java Stream API - Java 8(::) --streams (->)--lambda
public class Example4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(4);
        list.add(3);
        list.forEach(System.out::println);//Stream API Java 8
        list.forEach(n -> System.out.println(n));//lambda
    }
}
