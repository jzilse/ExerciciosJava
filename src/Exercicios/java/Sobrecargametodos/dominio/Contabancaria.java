package Exercicios.java.Sobrecargametodos.dominio;

public class Contabancaria {
    private String titular;
    private String numeroConta;
    private double saldo;
    private double limiteCredito;
    {
        limiteCredito = 500.0;
        saldo = 0.0;
    }
    public Contabancaria(String titular, String numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public Contabancaria(String titular, String numeroConta, double saldoinicial){
        this(titular, numeroConta);
        this.saldo = saldoinicial;
    }

    public Contabancaria(String titular, String numeroConta, double saldoinicial, double limiteCredito){
        this(titular, numeroConta, saldoinicial);
        this.limiteCredito = limiteCredito;
    }

    public void imprime(){
        System.out.println(this.titular);
        System.out.println(this.numeroConta);
        System.out.println(this.saldo);
        System.out.println(this.limiteCredito);
    }
}
