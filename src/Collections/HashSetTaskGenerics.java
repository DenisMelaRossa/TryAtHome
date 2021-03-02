package Collections;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetTaskGenerics {
    public static void main(String[] args) {
        HashSet<String> a = new HashSet<String>(Arrays.asList("a", "b"));
        HashSet<String> b = new HashSet<String>(Arrays.asList("a", "set"));
        HashSet<Integer> c = new HashSet<Integer>(Arrays.asList(0, 2, 4, 6, 9));
        HashSet<Integer> d = new HashSet<Integer>(Arrays.asList(10, 5, 1, 6));

        System.out.println(hashSetUnion(a, b));
        System.out.println(hashSetUnion(c, d));
        System.out.println(hashSetIntersection(a, b));
        System.out.println(hashSetMinus(c, d));
    }

    public static <T> HashSet<T> hashSetUnion(HashSet<T> setA, HashSet<T> setB) {
        HashSet<T> result = new HashSet<T>();
        result.addAll(setA);
        result.addAll(setB);
        return result;
    }

    public static <T> HashSet<T> hashSetIntersection(HashSet<T> setA, HashSet<T> setB) {
        HashSet<T> result = new HashSet<T>();
        result.addAll(setA);
        result.removeAll(hashSetMinus(setA, setB));
        return result;
    }


    public static <T> HashSet<T> hashSetMinus(HashSet<T> setA, HashSet<T> setB) {
        HashSet<T> result = new HashSet<T>();
        result.addAll(setA);
        result.removeAll(setB);
        return result;
    }

    public static <T> HashSet<T> hashSetDifference(HashSet<T> setA, HashSet<T> setB) {
        HashSet<T> result = new HashSet<T>();
        result.addAll(setA);
        result.addAll(setB);
        result.removeAll(hashSetIntersection(setA, setB));
        return result;
    }
}
