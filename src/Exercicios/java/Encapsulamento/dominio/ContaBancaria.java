package Exercicios.java.Encapsulamento.dominio;

public class ContaBancaria {
    private String titular;
    private String numeroConta = "01";
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double deposito){
        saldo+= deposito;
        return getSaldo();
    }

    public double saque(double saque){
        if (saldo > 0 && saldo > saque) {
            saldo -= saque;
        }  else {
            System.out.println("Saque inválido");
        }
        return getSaldo();
    }

}
