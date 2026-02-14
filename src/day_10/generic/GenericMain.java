package day_10.generic;

public class GenericMain {
public static void main(String[]args){
    genericExample<String> mensagemString = new genericExample("Nova Mensagem");
    mensagemString.escrever();
}
}
