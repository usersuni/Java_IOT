package Arrays;

public class E1 {
    public static void main(String[] args) {
        int[] arr;
        //method 2
        arr = new int[5];//memory allocation[20 bytes]
        int[] arr2 = new int[5];//declaration plus memory allocation
        //if we don't provide value
        //the JVM uses "Fallback Mechanism"
        //it uses the default value of that data type
        System.out.println(arr[3]);
        //method 3
        int[] arr3 = {1,2,3,4,5};
        //method 4
        int[] arr4 = new int[]{1,2,3,4,5};
    }
}
