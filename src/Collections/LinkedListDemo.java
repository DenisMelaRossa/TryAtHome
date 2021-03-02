package Collections;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList<>(Arrays.asList("try", "this"));
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.addFirst("first element");
        linkedList.addLast("last element");
        linkedList.add(1, "add element by index");

        System.out.println(linkedList);

        linkedList.set(1,"changed element");
        System.out.println(linkedList);

        linkedList.set(2,"2nd change: element "+linkedList.get(2));

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);


    }
}
