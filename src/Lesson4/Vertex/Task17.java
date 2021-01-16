package Lesson4.Vertex;

public class Task17 {
    public static void main(String[] args) {
        int[][] array = new int[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i <6 ; i++) {
            int max=array[i][0];
            for (int j = 0; j < 7; j++) {
                if (array[i][j]>max){
                    int t=array[i][0];
                    array[i][0]=array[i][j];
                    array[i][j]=t;
                    max=array[i][j];
                }
                            }
                    }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();

        }
    }
}
