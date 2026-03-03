package Arrays;

public class E3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};// 1D array
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};// 2D array -> array of 3 arrays - Matrix  - square matrix
        System.out.println(matrix);
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        for(int[] a : matrix){
            System.out.println(matrix + " ");
            char[][] names = {
                    {'s','u','n','i','l'},
                    {'a','k','a','s','h'},
                    {'n','i','t','h','i','n'}
            };
            for(char[] c : names){
                for(char x : c){
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}

