package Practice;

public class Task1_Task5 {
    public static void main(String[] args) {
        for (int i = 1; i <100 ; i+=2) {
            System.out.print(i+",");
        }

        System.out.println();
        int count=0;
        while(count<=25){
            for (int i = 0; i <= 100; i++) {
                if(i%2==0 && i%10!=0){
                    System.out.print(i+",");
                }
                count++;

            }
        }
    }




}
