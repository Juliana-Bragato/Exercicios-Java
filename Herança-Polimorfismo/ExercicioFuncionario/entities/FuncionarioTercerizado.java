package ExercicioFuncionario.entities;

public class FuncionarioTercerizado extends Funcionarios {

    private Double despesAdicional;

    public FuncionarioTercerizado() {
        super();
    }

    public FuncionarioTercerizado(String nome, Integer horas, Double valorPorHoras, Double despesAdicional) {
        super(nome, horas, valorPorHoras);
        this.despesAdicional = despesAdicional;
    }

    public Double getdespesAdicional() {
        return this.despesAdicional;
    }

    public void setdespesAdicional(Double despesAdicional) {
        this.despesAdicional = despesAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + despesAdicional * 1.1;

    }
}