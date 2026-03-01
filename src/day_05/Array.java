package day_05;

import java.util.Arrays;
import java.util.List;

public class Array {

    public static void main(String[] args) {
        int[] arrayDeInt;

        int arrayDeIntDiferente[];

        int[] arrayDeInt3 = new int[10];

        Integer[] arrayPreenchido = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int size = arrayPreenchido.length;
        System.out.println("O Tamanho do array é " + size);

        List<Integer> itens = Arrays.asList(arrayPreenchido);
        itens.forEach(System.out::println);


        String[] treinamento = new String[]{"treinamento", "descomplicando", "java", "e", "spring", "da", "linux", "tips"};
        String[] treinamentoNome = Arrays.copyOfRange(treinamento, 2, 7);
        List<String> treinamentoList = List.of(treinamento);
        List<String> treinamentoNomeList = List.of(treinamentoNome);
        treinamentoList.forEach(System.out::println);
        treinamentoNomeList.forEach(System.out::println);


        String[] array2 = Arrays.copyOf(treinamentoNome,2);
        List<String> array2List = List.of(array2);
        array2List.forEach(System.out::println);

        String[] java = new String[10];
        Arrays.fill(java, "java");

        List<String> javaList = List.of(java);
        javaList.forEach(System.out::println);


        int[] arrayde1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayde2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        System.out.println("Os arrays são iguais: " +
                Arrays.equals(arrayde1, arrayde2));

        String[] sorted = Arrays.copyOf(treinamento, 5);
        Arrays.sort(sorted);
        List<String> sortedList = List.of(sorted);
        sortedList.forEach(System.out::println);














    }


}