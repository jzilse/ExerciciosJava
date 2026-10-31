package Exercicios.Heranca.dominio;

public class Membro {
    private String nome;
    private String cpf;
    protected double valorBase = 100;

    public void calcularMensalidade(){
        System.out.println(this.valorBase);
    }

    public void validarAcesso(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }

    public Membro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
}
