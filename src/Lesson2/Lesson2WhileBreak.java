package Lesson2;

public class Lesson2WhileBreak {
    public static void main(String[] args) {
        int count = 1;

        while (true) {
            System.out.println("Line " + count+" New");
            if (count > 3) {
                break;
            }
            count++;
        }
    }
}
