package day_10.generic;

public class genericExample <T>{

    public void setName(T name) {
        this.name = name;
    }
    public T getName(){
        return name;
    }

    public genericExample(T mensagem) {
        this.name = mensagem;
    }

    T name;
    public void escrever(){
        System.out.println(name);
    }
}
