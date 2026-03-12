package Collection.lambdaExpressions;
 interface Square{
     int Calculate(int x);
 }
public class Example3 {
    public static void main(String[] args) {
        Square s = x -> x * x;
        System.out.println("Square : "+ s.Calculate(9));
    }
}
