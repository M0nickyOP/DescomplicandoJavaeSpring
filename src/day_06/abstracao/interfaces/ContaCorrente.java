package day_06.abstracao.interfaces;

public class ContaCorrente implements Conta {

        @Override
        public void consultarSaldo () {
            System.out.println("Seu saldo é 1500");
        }

        @Override
        public void fazerPix(){
            System.out.println("Digite o valor que voce deseja transferir");
        }

    public static interface Conta {
        public void consultarSaldo();
        public void fazerPix();
    }
}

