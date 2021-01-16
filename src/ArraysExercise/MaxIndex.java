package ArraysExercise;

public class MaxIndex {
    public static void main(String[] args) {
        int[] array={1,2,8,4,-9,-12,-27};

        int max=array[0];
        int index=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>=max){
                max=array[i];
                index=i;
            }

        }
        System.out.println(max+" "+index);

        int countelements=0;
        for (int i = 0; i <array.length ; i++) {
            if (Math.abs(array[i])>max){
                countelements++;
            }

        }
        System.out.println(countelements);
    }
}
