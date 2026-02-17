package day_14.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedAndForEach {
    public static void main(String[] args) {
        List<String> unsortedList = Arrays.asList("0", "5","7","Java","Spring","Linux");
        List<String> sortedList = unsortedList.stream().sorted().collect(Collectors.toList());

        sortedList.forEach(System.out::println);

    }
}
