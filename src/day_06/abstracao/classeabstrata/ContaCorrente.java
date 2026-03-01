package day_06.abstracao.classeabstrata;

public class ContaCorrente extends Conta{

    @Override
    public void consultarSaldo(){
        System.out.println("Seu saldo é 1200");

    }

    @Override
    public void fazerPix(){
        System.out.println("Digite o valor que você deseja transferir");
    }

}
