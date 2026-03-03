 class Static {
    static String name = "Java";
    static void display(){
        System.out.println("This is a Static variable : "+name);
        System.out.println("This is a Static method");
    }
}
public class StaticExample {
    public static void main(String[] args) {
        Static s = new Static();
        s.display();
    }
}
