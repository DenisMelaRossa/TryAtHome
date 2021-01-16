package Lesson4.Vertex;

public class Task14 {


    public static void main(String[] args) {
        int b=0;
        int c=0;
        for (int i = 1; i < 50000; i++) {


            int a1 = i % 10;
            int a2 = (i / 10) % 10;
            int a3 = (i / 100) % 10;
            int a4=(i/1000)%10;
            int a5=(i/10000)%10;
            if(a1==2||a2==2||a3==2||a4==2||a5==2){
                b++;
            }
            if (a4==2&&a5!=2){
                c++;
            }
        }
        System.out.println(b+" "+c);
    }
}