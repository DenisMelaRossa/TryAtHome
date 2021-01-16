package Lesson4.Vertex;

public class Array4 {
    public static void main(String[] args) {
        int[][] matrix = new int[1][5];
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
            int[][] newmatrix=new int[5][1];
        for (int i = 0; i < 1; i++) {
            for (int j = i; j < 5; j++) {

                newmatrix[j][i] = matrix[i][j];

            }

        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print(newmatrix[i][j]+" ");
            }
            System.out.println();

        }
    }
}
