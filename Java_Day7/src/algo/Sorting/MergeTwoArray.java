package algo.Sorting;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6};
        int[] merged = mergeTwoSortedArray(a,b);
        System.out.println("Merged Array : "+ Arrays.toString(merged));
    }
    public static int[] mergeTwoSortedArray(int[] a,int[] b){
        int n1 = a.length;
        int n2 = b.length;
        int[] merged = new int[n1+n2];
        int i =0,j = 0,k = 0;
        while(i < n1 && j < n2){
            if(a[i] < b[j]){
                merged[k++] = a[i++];
            }else{
                merged[k++] = b[j++];
            }
        }
        //check if there is any remaining element present int the two arrays
        while(i < n1){
            merged[k++] = a[i++];
        }
        while(j < n2){
            merged[k++] = b[j++];
        }
        return merged;
    }
}
