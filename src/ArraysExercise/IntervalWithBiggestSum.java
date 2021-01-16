package ArraysExercise;

public class IntervalWithBiggestSum {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,4};
        int maxsum = 0;
        int index1=0;
        int index2=0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                int sum=0;
                for (int k = i; k <i+j+1; k++) {
                    sum+=array[k];
                    if(sum>maxsum){
                        maxsum=sum;
                        index1=i;
                        index2=i+j;

                    }
                }
                sum=0;
            }

        }
        System.out.println(maxsum+" "+index1+" "+index2);
    }
}
