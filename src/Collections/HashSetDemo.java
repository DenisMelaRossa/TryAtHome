package Collections;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet setA=new HashSet<>(Arrays.asList("set1", "set2"));
        setA.add("new el");
        System.out.println(setA);
    }
}
