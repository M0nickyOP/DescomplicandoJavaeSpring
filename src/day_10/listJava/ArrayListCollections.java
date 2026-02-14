package day_10;
import java.util.ArrayList;

public class ArrayListCollections {
public static void main(String[] args) {
        ArrayList<Integer> meuArrayList = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            meuArrayList.add(i);
        }
        //remove um elemento
        meuArrayList.remove(4);
        System.out.println(meuArrayList);
        //acessa um indice especifico
      System.out.println(meuArrayList.get(1));
        //verifica se o array está vazio
        System.out.println(meuArrayList.isEmpty());
        // valida se um numero está contido no array
        System.out.println(meuArrayList.contains(7));
        //copia
        System.out.println(meuArrayList.clone());
        // verifica qual o indice está localizado
        System.out.println(meuArrayList.indexOf(9));


    }
}
