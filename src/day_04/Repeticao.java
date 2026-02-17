package day_04;
import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            System.out.println("o valor de i é "+ i);
        }
        Scanner in = new Scanner(System.in);
        var valorSecreto = 0;

        while (valorSecreto != 1234 ){
            System.out.println("Digite um valor: ");
            valorSecreto = in.nextInt();

            if (valorSecreto == 1234){
                System.out.println("Parabéns!Você acertou o valor secreto");
            }else{
                System.out.println("Tente novamente");
            }
        }

        int valor = 10;

        do{
            System.out.println(valor);
            valor++;
        }while (valor <= 50);
    }
}
