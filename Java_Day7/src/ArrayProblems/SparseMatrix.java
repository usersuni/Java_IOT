package ArrayProblems;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,0,3},
                {0,0,0},
                {4,0,0}
        };
        int rows = matrix.length;
        int cols = matrix[0].length; //only do it for square matrix
        int zeroCount = 0;
        int nonZero = 0;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(matrix[i][j] == 0){
                    zeroCount++;
                }else{
                    nonZero++;
                }
            }
        }
        System.out.println("Zeros : " + zeroCount);
        System.out.println("NonZeros : "+ nonZero);
        System.out.println(zeroCount > nonZero ? "Sparse":"Not Sparse");
    }
}
