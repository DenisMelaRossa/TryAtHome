package MatricesExercises;

import java.util.Arrays;

public class MatrixtoArrow {
    public static void main(String[] args) {
        int[][] matrix={{1,2,8,9},{3,4,7,4}};
        int m=matrix.length;
        int n=matrix[m-1].length;
        System.out.println(m+" "+n);

        int[] array=new int[m*n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i*n+j]=matrix[i][j];

            }

        }
        System.out.println(Arrays.toString(array));
    }
}
