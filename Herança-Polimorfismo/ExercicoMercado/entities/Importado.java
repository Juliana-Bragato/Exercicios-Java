package ExercicoMercado.entities;

public class Importado extends Produto {

    private Double taxAlfandegaria;

    public Importado() {
        super();
    }

    public Importado(String nome, Double preco, Double taxAlfandegaria) {
        super(nome, preco);
        this.taxAlfandegaria = taxAlfandegaria;
    }

    public Double getTaxAlfandegaria() {
        return this.taxAlfandegaria;
    }

    public void setTaxAlfandegaria(Double taxAlfandegaria) {
        this.taxAlfandegaria = taxAlfandegaria;
    }

    public double PrecoTotal() {
        return getPreco() + taxAlfandegaria;
    }

    @Override
    public final String etiquetaDePreco() {
        return getNome()
                + " $ "
                + String.format("%.2f", PrecoTotal())
                + " ( Taxa Alfandegária: $ "
                + String.format("%.2f", taxAlfandegaria)
                + " ) ";

    }
}
