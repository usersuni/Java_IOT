public class method {
    void myMethod(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        method obj = new method();
        obj.myMethod(5, 10);
    }
}
