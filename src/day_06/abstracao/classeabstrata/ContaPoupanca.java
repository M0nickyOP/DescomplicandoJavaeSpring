package day_06.abstracao.classeabstrata;

public class ContaPoupanca extends Conta{
    @Override
    public void consultarSaldo() {
    System.out.println("Seu saldo é zero");
    }

    @Override
    public void fazerPix() {
    System.out.println("Transferência não permitida");
    }

}
