package Entidades;

public class Juridica extends Contribuinte {

    private Integer numerosEmpregados;

    public Juridica(String nome, Double rendimentoAnual, Integer numerosEmpregados) {
        super(nome, rendimentoAnual);
        this.numerosEmpregados = numerosEmpregados;
    }

    public Integer getNumerosEmpregados() {
        return this.numerosEmpregados;
    }

    public void setNumerosEmpregados(Integer numerosEmpregados) {
        this.numerosEmpregados = numerosEmpregados;
    }

    @Override

    public Double Taxa() {
		if (numerosEmpregados > 10) {
			return getRendimentoAnual() * 0.14;
		}
		else {
			return getRendimentoAnual() * 0.16;
		}
	}
}
