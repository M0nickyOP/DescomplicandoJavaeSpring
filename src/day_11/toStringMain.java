package day_11;

public class toStringMain {
    public static void main(String[]args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Miguel");
        funcionario.setSalario(1500.0);
        funcionario.setIdade(19);
        funcionario.setCargo("tech lead");
        funcionario.setSetor("Bancario");
        System.out.println(funcionario);
        System.out.println(funcionario.getSetor().equals("Bancario"));
        System.out.println(funcionario.hashCode());
        System.out.println(funcionario);
    }
}
