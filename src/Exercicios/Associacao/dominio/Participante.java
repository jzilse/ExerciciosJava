package Exercicios.Associacao.dominio;

public class Participante {
    private String nome;
    private Empresa empresa;

    public Participante(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (empresa != null) {
            System.out.println(empresa.getNome());
        }
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
