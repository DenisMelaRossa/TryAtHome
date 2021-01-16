package Lesson2;

public class Lesson2Case {
    public static void main(String[] args) {
        char grade = 'L';

        switch (grade) {
            case 'A':
                System.out.println("Great");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Satisfactory");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Incorrect grade");
        }
        System.out.println("Your grade " + grade);
    }
}
