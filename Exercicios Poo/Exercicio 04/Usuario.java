public class Usuario {

    public String name;
    public String resposta;
    private int conta;
    private double saldo;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConta() {
        return this.conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
    }

    public void retirar(double saque) {
        this.saldo -= saque + 5;
    }

    public String toString() {
        return "Conta: " + getConta() + ", " + "cliente: " + getName() + ", " + "Saldo: R$ " + getSaldo();
    }

}