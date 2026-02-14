package day_09;

public enum DescontoEnum {

    ALUNA(10), FUNCIONARIO(20), EXTERNO(5);
    int valor;

    DescontoEnum(int valor){
        this.valor = valor;
    }
    public static void main(String[]args){
        for (DescontoEnum descontoEnum : DescontoEnum.values()){
            System.out.println("tipo de desconto " + descontoEnum + " valor: " + descontoEnum.valor);
        }
    }
}
