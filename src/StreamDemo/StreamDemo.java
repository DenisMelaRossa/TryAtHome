package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<String> names = new ArrayList<>(Arrays.asList("John", "jan", "Marry", ""));
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        names.stream()
                .filter(i -> !i.isEmpty() && i.contains("a"))
                .forEach(System.out::println);

        numbers.stream()
                .map(i->i*2)
                .forEach(System.out::println);

        names.stream()
                .forEach(System.out::println);
    }
}
