package Lesson4.Vertex;

public class Task14Array {
    public static void main(String[] args) {
        int[][] array=new int[5][8];
        int max=array[0][0];
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <8 ; j++) {
                array[i][j]=(int)(Math.random()*200)-100;
                System.out.print(array[i][j]+" ");
                if(array[i][j]>max){
                    max=array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(max);
    }
}
