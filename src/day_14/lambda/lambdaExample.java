package day_14.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lambdaExample {
    public static void main(String[] args) {
        List<String> linguagens = Arrays.asList("Java", "Ruby", "Python", "PHP");
        List<String> java = linguagens.stream().filter(a -> a.equals("Java")).collect(Collectors.toList());
        System.out.println(java);
    }
}
