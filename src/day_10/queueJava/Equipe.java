package day_10.queueJava;

public class Equipe {

    public String nome;
    public int saldoPontos;

    public Equipe(String nome, int saldoPontos) {
        this.nome = nome;
        this.saldoPontos = saldoPontos;
    }

    @Override
    public String toString() {
        return "Equipe" + nome + " está com a pontuação" + saldoPontos;
    }

}
