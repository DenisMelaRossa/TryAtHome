package MatricesExercises;

public class IndexofMin {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 3,0}, {3, 0, 1,0}};

        int min = matrix[0][0];
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] <= min) {
                    min = matrix[i][j];
                }
            }
        }
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix[j].length; k++) {
                    if (matrix[j][k] == min) {
                        count++;
                    }
                }
            }
                int[][] indices=new int[count][2];
                int k=0;

                for (int l = 0; l < matrix.length; l++) {
                    for (int n = 0; n < matrix[l].length; n++) {
                        if (matrix[l][n]==min){
                            indices[k][0]=l;
                            indices[k][1]=n;
                            k++;
                        }

                    }

                }
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[i].length; j++) {
                System.out.print(indices[i][j]+" ");

            }
            System.out.println();
        }


            }

        }


