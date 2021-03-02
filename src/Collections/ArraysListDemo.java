package Collections;

import java.util.*;
import java.util.stream.Stream;

public class ArraysListDemo {
    public static void main(String[] args) {
        List arraysList =new ArrayList<>(Arrays.asList(4,1,2,3));
        ArrayList newList=new ArrayList<>();
        newList.add("First");
        newList.add("Second");
        newList.add("Third");
        newList.add("Fourth");
        System.out.println(newList);
        System.out.println(arraysList);

        List copyArray=new ArrayList(arraysList);
        System.out.println(copyArray);
        Collections.addAll(newList,"s","d");
        System.out.println(newList);
        Collections.addAll(arraysList,1,2,'a');
        System.out.println(arraysList);
        arraysList.remove((int)1);
        System.out.println(arraysList);
        arraysList.remove(1);
        System.out.println(arraysList);
        Integer [] otherlist={13,4,9}; // Only capital Integer, not int
        Collections.addAll(arraysList, otherlist);
        System.out.println(arraysList);
        System.out.println(arraysList.size());
    }

}
