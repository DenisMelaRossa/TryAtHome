package StringExercises;

import java.util.Arrays;

public class ArabicNumbers {
    public static void main(String[] args) {
        int n = 1508;
        System.out.println(arabicConvector(n));
    }

    public static String arabicConvector(int n) {
        String[] input = new String[4];
        Arrays.fill(input, "");
        int i = 3;
        while (n > 0) {
            input[i] = Integer.toString(n % 10);
            n /= 10;
            i--;
        }
        input[3] = ones(input[3]);
        input[2] = tens(input[2]);
        input[1] = hundreds(input[1]);
        input[0] = thousands(input[0]);
        String result = "";
        for (int j = 0; j < input.length; j++) {
            result = result.concat(input[j]);
        }
        return result;
    }

    public static String ones(String t) {
        String one = "";
        switch (t) {
            case "1":
                one = "I";
                break;
            case "2":
                one = "II";
                break;
            case "3":
                one = "III";
                break;
            case "4":
                one = "IV";
                break;
            case "5":
                one = "V";
                break;
            case "6":
                one = "VI";
                break;
            case "7":
                one = "VII";
                break;
            case "8":
                one = "VIII";
                break;
            case "9":
                one = "IX";
                break;
            default:
                one = "";
        }
        return one;
    }

    public static String tens(String t) {
        String ten = "";
        switch (t) {
            case "1":
                ten = "X";
                break;
            case "2":
                ten = "XX";
                break;
            case "3":
                ten = "XXX";
                break;
            case "4":
                ten = "XL";
                break;
            case "5":
                ten = "L";
                break;
            case "6":
                ten = "LX";
                break;
            case "7":
                ten = "LXX";
                break;
            case "8":
                ten = "LXXX";
                break;
            case "9":
                ten = "XC";
                break;
            default:
                ten = "";
        }
        return ten;
    }

    public static String hundreds(String t) {
        String hundred = "";
        switch (t) {
            case "1":
                hundred = "C";
                break;
            case "2":
                hundred = "CC";
                break;
            case "3":
                hundred = "CCC";
                break;
            case "4":
                hundred = "CD";
                break;
            case "5":
                hundred = "D";
                break;
            case "6":
                hundred = "DC";
                break;
            case "7":
                hundred = "DCC";
                break;
            case "8":
                hundred = "DCCC";
                break;
            case "9":
                hundred = "CM";
                break;
            default:
                hundred = "";
        }
        return hundred;
    }

    public static String thousands(String t) {
        String thousand = "";
        switch (t) {
            case "1":
                thousand = "M";
                break;
            case "2":
                thousand = "MM";
                break;

            default:
                thousand = "";
        }
        return thousand;
    }
}
