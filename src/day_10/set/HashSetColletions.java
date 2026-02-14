package day_10.set;
import java.util.HashSet;

public class HashSetColletions {
    public static void main(String[]args){
        HashSet<String> linguagens = new HashSet<String>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Javascript");
        linguagens.add("Kotlin");
        linguagens.add("C#");
        linguagens.add("Ruby");
        linguagens.add("Assembly");
    System.out.println(linguagens);
    System.out.println(linguagens.size());
    for(String i : linguagens){
        System.out.println(i);
    }
    }
}
