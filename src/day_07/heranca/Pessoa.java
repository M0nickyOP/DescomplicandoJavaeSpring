package day_07.heranca;

public class Pessoa {
    public static void main(String[] args) {
        PessoaDesenvolvedoraBackEnd pessoaDesenvolvedoraBackEnd = new PessoaDesenvolvedoraBackEnd("Monicky", "Java e Spring", 60000.0);
        pessoaDesenvolvedoraBackEnd.codar();

        PessoaDesenvolvedoraFrontEnd pessoaDesenvolvedoraFrontEnd = new PessoaDesenvolvedoraFrontEnd("Monicky", "Javascript", 1500.0);
        pessoaDesenvolvedoraFrontEnd.codar();
    }
}
