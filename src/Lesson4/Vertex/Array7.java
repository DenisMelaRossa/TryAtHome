package Lesson4.Vertex;

public class Array7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 7, 9};
        int k = array.length;
        boolean increasing = true;

        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (array[i] > array[j]) {
                    increasing = false;
                    break;
                }
            }

        }
        if (increasing == true) {
            System.out.println("Yes1");
        }

        boolean flag = true;
        int[] array2 = {1, 7, 3, 4};
        for (int i = 0; i < array2.length-1; i++) {
            if (array2[i] > array2[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Yes2");

        }

    }
}
