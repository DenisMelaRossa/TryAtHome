package Practice;

public class Task7 {
    public static void main(String[] args) {
        for (int i = 0; i <14 ; i++) {
            if(i==0){
                System.out.println(1);
            }else {
                System.out.println(((long) Math.pow(10, i) + 1) + "");
            }
        }
        for (int i = 12; i >=0 ; i--) {
                if(i==0){
                    System.out.println(1);
                }else {
                    System.out.println(((long) Math.pow(10, i) + 1) + "");
                }
            }

        }
    }

