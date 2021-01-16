package Lesson4.Vertex;

public class Task15 {
    public static void main(String[] args) {
        int maxproduct=0;
        int line=0;
        int[][] array=new int[7][4];
        for (int i = 0; i < 7; i++) {
            int product=1;
            for (int j = 0; j <4 ; j++) {
                array[i][j]=(int)(Math.random()*10)-5;
                System.out.print(array[i][j]+" ");
                product*=Math.abs(array[i][j]);
            }
            System.out.println();
            if(product>maxproduct){
                maxproduct=product;
                line=i;
            }
        }
        System.out.println(maxproduct+" in line "+line);
    }
}
