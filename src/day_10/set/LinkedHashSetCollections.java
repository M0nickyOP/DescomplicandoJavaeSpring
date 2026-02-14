package day_10.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetCollections {
    public static void main(String[]args){
        LinkedHashSet<String> linguagens = new LinkedHashSet<String>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Javascript");
        linguagens.add("Kotlin");
        linguagens.add("C#");
        linguagens.add("Ruby");
        linguagens.add("Assembly");

        System.out.println(linguagens.remove("Python"));
        System.out.println(linguagens);
    }
}
