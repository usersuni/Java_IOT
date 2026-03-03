package Exception;

public class E1 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 10;
        try {
            k = i / j;
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[9]);
//        }catch(ArithmeticException e){
//            System.out.println(e);
//            e.printStackTrace();//details lines for backend developer
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Something happend");
        }
        finally{
            System.out.println("End of execution");
        }
    }
}
