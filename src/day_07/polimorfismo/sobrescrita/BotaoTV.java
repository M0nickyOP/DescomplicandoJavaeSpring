package day_07.polimorfismo.sobrescrita;

public class BotaoTV extends Botao{
    @Override
    public void ligar() {
        System.out.println("Ligar a TV");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando...");
    }
}
