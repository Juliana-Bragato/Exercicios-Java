package ExercicoMercado.entities;

public class Produto {

    private String Nome;
    private Double Preco;

    public Produto() {
    }

    public Produto(String nome, Double preco) {
        Nome = nome;
        Preco = preco;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Double getPreco() {
        return this.Preco;
    }

    public void setPreco(Double Preco) {
        this.Preco = Preco;
    }

    public String etiquetaDePreco() {
        return Nome
                + " $ "
                + String.format("%.2f", Preco);

    }
}
