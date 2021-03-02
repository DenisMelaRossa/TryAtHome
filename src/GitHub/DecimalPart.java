package GitHub;

import java.util.Arrays;

public class DecimalPart {
    public static void main(String[] args) {
        float[] input={1.4f, 1.2f, 1.9f};
        System.out.println(Arrays.toString(getFractinalPart(input)));
        System.out.println(Arrays.toString(getIntegerFractionalPart(input)));

    }

    public static float[] getFractinalPart(float[] input) {
        float[] result = new float[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i] - (int) (input[i]);
        }
        return result;
    }

    public static int[] getIntegerFractionalPart (float[] input){
        int[] result=new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i]=(int)(input[i]-(int)input[i])*10;
        }
        return result;
    }
}
