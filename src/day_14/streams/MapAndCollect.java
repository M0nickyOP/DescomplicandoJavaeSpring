package day_14.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndCollect {
    public static void main(String []args){
        List<String> listaString = Arrays.asList("1","2","3");
        System.out.println(listaString);
        List<Integer>minhaListaInteira = listaString.stream().map(Integer ::valueOf).toList();
        System.out.println(minhaListaInteira);
    }
}
