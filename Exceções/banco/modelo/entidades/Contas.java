package modelo.entidades;

import modelo.DominioExcecoes.MainExcecoes;

public class Contas {

    private Integer numeroConta;
    private String cliente;
    private Double balanco;
    private Double limiteSaque;

    public Contas(Integer numeroConta, String cliente, Double balanco, Double limiteSaque) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.balanco = balanco;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getBalanco() {
        return this.balanco;
    }

    public void setBalanco(Double balanco) {
        this.balanco = balanco;
    }

    public Double getLimiteSaque() {
        return this.limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(double saque) {
        balanco += saque;
    }

    public void saque(double saque) {
        validadesaque(saque);
        balanco -= saque;
    }

    private void validadesaque(double saque) {
        if (saque > getLimiteSaque()) {
            throw new MainExcecoes("Erro de saque: A quantia excede o limite de saque");
        }
        if (saque > getBalanco()) {
            throw new MainExcecoes("Erro de saque: Saldo insuficiente");
        }
    }

}