package day_06.abstracao.classeabstrata;

public class LinuxTipsBankMain {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao Linux Tips Bank");

        ContaCorrente ccMonicky = new ContaCorrente();
        ccMonicky.consultarSaldo();
        ccMonicky.fazerPix();

        ContaPoupanca cpMonicky = new ContaPoupanca();
        cpMonicky.consultarSaldo();
        cpMonicky.fazerPix();
    }
}
