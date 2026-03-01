package day_06.encapsulamento;

public class Cachorro {
    private Double peso;
    private Integer idade;

    public Double pesoPublic;
    public Integer idadePublic;

    public Double getPesoProtegido() {
        return pesoProtegido;
    }

    public void setPesoProtegido(Double pesoProtegido) {
        this.pesoProtegido = pesoProtegido;
    }

    public Integer getIdadeProtegido() {
        return idadeProtegido;
    }

    public void setIdadeProtegido(Integer idadeProtegido) {
        this.idadeProtegido = idadeProtegido;
    }

    protected Double pesoProtegido;
    protected Integer idadeProtegido;

    public String latir(){
        return "au au";
    }
    protected String dormir(){
        return "zzz...";
    }
    private String comer(){
        return "hora de comer!!";
    }
}
