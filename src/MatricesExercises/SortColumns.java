package MatricesExercises;

public class SortColumns {
    public static void main(String[] args) {
        int[][] array = new int[4][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int n = 0; n < array.length - 1; n++) {
            for (int k = 0; k < array[0].length -n- 1; k++) {
                if (array[0][k + 1] < array[0][k]) {
                    for (int m = 0; m < array.length; m++) {
                        int t = array[m][k];
                        array[m][k] = array[m][k + 1];
                        array[m][k + 1] = t;
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

    }
}
