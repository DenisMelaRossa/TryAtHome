package MatricesExercises;

public class ColumnChange {
    public static void main(String[] args) {
        int[][] array = new int[2][7];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= 3; j++) {
                int t = array[i][j];
                array[i][j] = array[i][7 - j - 1];
                array[i][7 - j - 1] = t;


            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
