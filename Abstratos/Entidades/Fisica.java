package Entidades;

public class Fisica extends Contribuinte {

    private Double gastoSaude;

    public Fisica(String nome, Double rendimentoAnual, Double gastoSaude) {
        super(nome, rendimentoAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return this.gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override

    public Double Taxa() {
        if (getRendimentoAnual() < 20000.0) {
            return getRendimentoAnual() * 0.15 - gastoSaude * 0.5;
        } else {
            return getRendimentoAnual() * 0.25 - gastoSaude * 0.5;
        }
    }
}
