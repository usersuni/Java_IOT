package Exception;

public class E2 {
    public static void main(String[] args) {
        int i,j,k = 0;
        i = 20;
        j = 0;
        try{
            k = i/j;
            int[] arr = {1,2,3,3,4};
            System.out.println(arr[9]);
//           //Multi catch block
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
        }
    }
}
