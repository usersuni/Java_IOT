package algo.Searching;

public class BinarySearch {
    static int binarySearch(int[] arr,int key){
        int s = 0;
        int e = arr.length-1;
        while(s < e){
            int mid = s + (e - 1)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                s = mid + 1; //go to the right side
            }else{
                e = mid - 1; //go to the left side
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,12};
        System.out.println(binarySearch(arr,9));
    }
}
