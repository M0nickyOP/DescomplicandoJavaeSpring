package day_11;
import java.util.Objects;

public class Funcionario {
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }


    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getSetor() {
        return setor;
    }

    public Double getSalario() {
        return salario;
    }

    private Integer idade;
    private String nome;
    private String cargo;
    private String setor;
    private Double salario;

    @Override
    public String toString() {
        return "Funcionario" +
                "idade=" + idade + ", nome= " + nome +  ", cargo= " + cargo +  ", setor=" + setor +  ", salario=" + salario;
    }
}
