package algo.Sorting;

import java.util.Arrays;

public class CountSort {
    public static void countSort(int[] arr){
        //Step 1 find max
        int k = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > k){
                k = arr[i];
            }
        }
        //step 2 create count array
        int[] count = new int[k+1];
        //step:3 calculate the freq of each element in the array
        for(int i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //Step 4: calculate the cumulative frequency
        //skip the index 0 and start from 1 till max(k)
        for(int i = 1;i<=k;i++){
            //curr = curr + prev
            count[i] += count[i-1];
        }
        //creating the output array
        int[] output = new int[arr.length];
        //step 6: start from the end of the array(L <- R)
        for(int i = arr.length-1;i>=0;i--){
            output[--count[arr[i]]] = arr[i];
        }
        //copy the output back to the input
        System.arraycopy(output,0,arr,0,arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,3,5,6,4,7,4,0};
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
