package Exception;

public class E3 {
    static void checkAge(int age){
        if(age > 18){
            System.out.println("Eligable - Access granted");
        }else{
            throw new RuntimeException("Not Eligable - Access denained");
        }
    }
    public static void main(String[] args) {
        checkAge(19);
    }
}
