package StringExercises;

import java.util.Scanner;

public class DiffChars {
    public static void main(String[] args) {
        int n = 5;

        Scanner scanner = new Scanner(System.in);
        String[] strLine = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a word: ");
            strLine[i] = scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            char[] word = strLine[i].toCharArray();
            boolean check = true;
            for (int j = 0; j < word.length; j++) {
                for (int k = 0; k < word.length; k++) {
                    if (word[j] == word[k] && j != k) {
                        check = false;
                        break;
                    }
                }
            }
            if (check == true) {
                String result = strLine[i];
                System.out.println(result);
                break;
            }
        }

    }
}
