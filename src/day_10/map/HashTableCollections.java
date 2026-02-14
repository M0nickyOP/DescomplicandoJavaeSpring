package day_10.map;

import java.util.Hashtable;

public class HashTableCollections {
    public static void main(String[]args){
        Hashtable<String,Double> notas = new Hashtable<String, Double>();
        notas.put("Logica de programacao",7.0);
        notas.put("Orientacao a objetos",9.5);
        notas.put("Seguranca da informacao",8.8);
        notas.put("Java",10.0);
        System.out.println(notas);
        System.out.println(notas.values());
        System.out.println(notas.replace("Logica de programacao",10.0));
        System.out.println(notas);
    }
}
