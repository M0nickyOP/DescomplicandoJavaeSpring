package day_06;

public class Objetos {
    public static void main(String[] args) {
        Estudante monickyOliv = new Estudante();
        monickyOliv.setNome("Monicky");
        monickyOliv.setStack("Java e Spring");

        monickyOliv.estudar();
        monickyOliv.dormir();

        System.out.println(monickyOliv.getNome());
        System.out.println(monickyOliv.getStack());

    }
}
