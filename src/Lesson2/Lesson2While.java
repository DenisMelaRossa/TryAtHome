package Lesson2;

public class Lesson2While {
    public static void main(String[] args) {
        int countDown=10;

        while (countDown>0) {
            System.out.println("Start in "+countDown);
            countDown-=2;
        }
        System.out.println("Go");
    }
}
