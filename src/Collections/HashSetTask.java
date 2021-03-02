package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetTask {
    public static void main(String[] args) {
        HashSet a = new HashSet(Arrays.asList(0, 2, 3, 4, 8, 11));
        HashSet b = new HashSet(Arrays.asList(0, 2, 4, 6, 9));
        System.out.println(hashSetIntersection(a, b));
        System.out.println(hashSetUnion(a, b));
        System.out.println(hashSetMinus(a, b));
        System.out.println(hashSetDifference(a,b));

    }

    public static HashSet hashSetUnion(HashSet setA, HashSet setB) {
        HashSet result = new HashSet<>();
        result.addAll(setA);
        result.addAll(setB);
        return result;
    }

    public static HashSet hashSetIntersection(HashSet setA, HashSet setB) {
        HashSet result = new HashSet<>();
        result.addAll(setA);
        result.removeAll(hashSetMinus(setA, setB));
        return result;
    }


    public static HashSet hashSetMinus(HashSet setA, HashSet setB) {
        HashSet result = new HashSet<>();
        result.addAll(setA);
        result.removeAll(setB);
        return result;
    }

    public static HashSet hashSetDifference(HashSet setA, HashSet setB) {
        HashSet result = new HashSet<>();
        result.addAll(setA);
        result.addAll(setB);
        result.removeAll(hashSetIntersection(setA, setB));
        return result;
    }


}
