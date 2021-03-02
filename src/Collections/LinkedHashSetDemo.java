package Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet lSet=new LinkedHashSet<>(Arrays.asList(5,4,1,2,3));
        System.out.println(lSet);
    }
}
