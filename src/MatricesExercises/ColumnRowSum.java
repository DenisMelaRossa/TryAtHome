package MatricesExercises;

public class ColumnRowSum {
    public static void main(String[] args) {
        int[][] matrix = new int[3][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int[][] summatrix = new int[matrix.length + 1][matrix[0].length + 1];

        int sum=0;
        for (int i = 0; i <matrix.length ; i++) {
            sum=0;
            for (int j = 0; j <matrix[0].length ; j++) {
                sum+=matrix[i][j];
                summatrix[i][j]=matrix[i][j];
            }
            summatrix[i][matrix[0].length]=sum;
        }

        for (int i = 0; i <matrix[0].length; i++) {
            sum=0;
            for (int j = 0; j <matrix.length ; j++) {
                sum+=matrix[j][i];

            }
            summatrix[matrix.length][i]=sum;
        }
        for (int i = 0; i < summatrix.length; i++) {
            for (int j = 0; j < summatrix[i].length; j++) {
                System.out.print(summatrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}
