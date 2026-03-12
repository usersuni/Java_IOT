package algo.Searching;

public class LinearSearch {
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,52,0,8,1,3};
        System.out.println(linearSearch(arr,8));
    }
}
