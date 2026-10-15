package Exercicios.java.Metodos.dominio;

public class ContaBancaria {
    public String titular;
    public double saldo = 0;

    public double depositar(double valor){
            this.saldo += valor;
            return this.saldo;
        }

    public double sacar(double valor){
        this.saldo -= valor;
        System.out.println("Saque de valor R$"+ valor + " Realizado");
        return this.saldo;
    }
    public void consultar(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Saldo: R$"+this.saldo);
    }
}
