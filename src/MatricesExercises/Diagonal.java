package MatricesExercises;

public class Diagonal {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = (int) (Math.random() * 100) - 50;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            if (array[i][i]>0){
                System.out.println(array[i][i]+" ");
            }


        }
    }
}
