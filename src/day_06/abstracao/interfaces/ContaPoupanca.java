package day_06.abstracao.interfaces;

public class ContaPoupanca implements Conta{

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é zero");
    }

    @Override
    public void fazerPix() {
        System.out.println("Transferência não permitida");
    }
}
