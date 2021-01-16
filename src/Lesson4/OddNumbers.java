package Lesson4;

public class OddNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if (i%2==0 && i%10!=0){
                System.out.print(i+" ");
            }
        }
    }
}
