package day_08;
import java.util.Scanner;

public class pedidoScanner {
    public static void main(String[]args){
        System.out.println("Por favor, insira o codigo do produto");
        Scanner sc = new Scanner(System.in);
        String codigo = sc.nextLine();
        System.out.println("Por favor, insira a quantidade de itens desse produto");
        int quantidade = sc.nextInt();
        System.out.println("Insira o valor desse produto");
        Integer valor = sc.nextInt();
        int total = valor * quantidade;
        System.out.println("O valor total dessa compra é " + total);


    }
}
