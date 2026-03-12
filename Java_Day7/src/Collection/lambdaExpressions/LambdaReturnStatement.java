package Collection.lambdaExpressions;

interface Calculator{
    int operator(int a,int b);
}
public class LambdaReturnStatement {
    public static void main(String[] args) {
        Calculator m = (a,b) -> {
            int result = a * b;
            return result;
        };
        System.out.println("Multiplication : "+m.operator(2,4));
    }
}
