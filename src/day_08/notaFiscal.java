package day_08;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Files;
public class notaFiscal {
    public static void main(String[]args) throws IOException {
        System.out.println("Por favor, insira o codigo do produto");
        Scanner sc = new Scanner(System.in);
        String codigo = sc.nextLine();
        System.out.println("Por favor, insira a quantidade de itens desse produto");
        int quantidade = sc.nextInt();
        System.out.println("Insira o valor desse produto");
        Integer valor = sc.nextInt();
        int total = valor * quantidade;
        System.out.println("O valor total dessa compra é " + total);

    Path fileName = Path.of("src/day_08/nota-fiscal" + codigo);
    String text = "Codigo do produto " + codigo + " qtd: " + quantidade + " valor do produto:" + valor + "\n" + "total do produto: " + total;
        Files.writeString(fileName, text);
    String file_content = Files.readString(fileName);
    System.out.println(file_content);
    }
}
