package day_14.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args){
        List<String>linguagens = Arrays.asList("Java", "Ruby", "Python", "PHP");
        List<String>TerminaComA = linguagens.stream().filter(a -> a.endsWith("a")).collect(Collectors.toList());
        System.out.println(TerminaComA);
    }
}
