package day_06.abstracao.interfaces;

import day_06.abstracao.classeabstrata.ContaPoupanca;

public class LinuxTipsBankMain {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao banco Linux Tips Bank");

        ContaCorrente ccMonicky = new ContaCorrente();
        ccMonicky.consultarSaldo();
        ccMonicky.fazerPix();

        ContaPoupanca cpMonicky = new ContaPoupanca();
        cpMonicky.consultarSaldo();
        cpMonicky.fazerPix();

    }
}
