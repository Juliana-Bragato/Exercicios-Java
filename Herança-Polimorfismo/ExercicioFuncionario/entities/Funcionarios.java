package ExercicioFuncionario.entities;

public class Funcionarios {

    private String nome;
    private Integer horas;
    private Double ValorPorHoras;

    public Funcionarios() {
    }

    public Funcionarios(String nome, Integer horas, Double valorPorHoras) {
        this.nome = nome;
        this.horas = horas;
        ValorPorHoras = valorPorHoras;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return this.horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorPorHoras() {
        return this.ValorPorHoras;
    }

    public void setValorPorHoras(Double ValorPorHoras) {
        this.ValorPorHoras = ValorPorHoras;
    }

    public double pagamento() {
        return horas * ValorPorHoras;

    }
}
