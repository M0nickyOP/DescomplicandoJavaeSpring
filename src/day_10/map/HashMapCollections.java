package day_10.map;

import java.util.HashMap;

public class HashMapCollections {
    public static void main(String[]args){
        HashMap<String,Double> notas = new HashMap<String, Double>();
        notas.put("Logica de programacao",7.0);
        notas.put("Orientacao a objetos",9.5);
        notas.put("Seguranca da informacao",8.8);
        notas.put("Java",10.0);
        System.out.println(notas);
        System.out.println(notas.get("Seguranca da informacao"));
        System.out.println(notas.containsKey("Java"));
        System.out.println(notas.containsValue(9.5));
    }
}
