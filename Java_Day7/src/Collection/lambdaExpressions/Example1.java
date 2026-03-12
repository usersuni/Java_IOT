package Collection.lambdaExpressions;

public class Example1 {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Thread is Running using Lambda(->)");
        };
        Thread t= new Thread(r);
        t.start();
    }
}
