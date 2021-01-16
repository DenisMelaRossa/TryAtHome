package MatricesExercises;

public class ColumnwithMaxsum {
    public static void main(String[] args) {
        int[][] array = new int[2][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int[] columnsum = new int[array[0].length];
        int columnindex = 0;

        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            columnsum[i] = sum;
            System.out.print(columnsum[i] + " ");
        }

        int max=columnsum[0];
        int maxindex=0;
        for (int i = 0; i <columnsum.length ; i++) {
            if(columnsum[i]>max){
                max=columnsum[i];
                maxindex=i;
            }
        }
        System.out.println();
        System.out.println(maxindex);

    }
}

