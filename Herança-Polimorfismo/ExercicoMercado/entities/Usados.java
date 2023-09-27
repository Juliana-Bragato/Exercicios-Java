package ExercicoMercado.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usados extends Produto {

    private LocalDate dataDeFabricacao;

    public Usados(String nome, Double preco, LocalDate dataDeFabricacao) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public LocalDate getDataDeFabricacao() {
        return this.dataDeFabricacao;
    }

    public void setDataDeFabricacao(LocalDate dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String etiquetaDePreco() {
        return getNome()
                + " (Usado) "
                + String.format("%.2f", getPreco())
                + " ( Data de Fabricação: "
                + dataDeFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + " )";
    }

}
