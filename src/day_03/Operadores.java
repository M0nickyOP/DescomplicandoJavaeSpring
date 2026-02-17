package day_03;

public class Operadores {
    public static void main(String[] args) {
        //Operador atribuicao
        int idade = 19;
        System.out.println("Minha idade é: " + idade);

        //operadores matematicos
        int soma = idade + 8;
        System.out.println("Soma: " + soma);

        int multiplicacao = soma * 5;
        System.out.println("Multiplicacao: " + multiplicacao);

        int divisao = multiplicacao / 3;
        System.out.println("Divisao: " + divisao);

        int modulo = divisao % 2;
        System.out.println("Modulo: " + modulo);

        //incremento e decremento
        int incremento = 16;
        System.out.println("Valor original: " + incremento);
        incremento++;
        System.out.println("Incremento: " + incremento);

        int decremento = 21;
        System.out.println("Valor original: " + decremento);
        decremento--;
        System.out.println("Decremento: " + decremento);

        //operadores de igualdade
        long valor = 1L;
        long outroValor = 5L;
        if (valor == outroValor) {
            System.out.println("os valores são igual");
        }else{
            System.out.println("os valores são diferentes");
        }

        double valor1 = 153.26;
        double valor2 = 354.32;
        if (valor1 != valor2) {
            System.out.println("os valores são diferentes");
        }else{
            System.out.println("os valores são iguais");
        }
        // operadores relacionais
        int primeiroValor = 1234;
        int segundoValor = 12345;

        if(primeiroValor > segundoValor) {
            System.out.println(primeiroValor + " é maior que " + segundoValor);
        } if(primeiroValor >= segundoValor) {
            System.out.println(primeiroValor + " é maior ou igual " + segundoValor);
        } if(primeiroValor < segundoValor) {
            System.out.println(primeiroValor + " é menor que " + segundoValor);
        } if(primeiroValor <= segundoValor) {
            System.out.println(primeiroValor + " é menor ou igual " + segundoValor);
        }

        // operadores logicos
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro && falso);
    }
}
