package day_14.streams;

import java.util.Arrays;
import java.util.List;

public class Reduce {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int listaReduzida = integerList.stream().reduce(0, Integer::sum);
        System.out.println(listaReduzida);
    }
}
