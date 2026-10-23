package Exercicios.Associacao.dominio;

public class Escola {
    private String nome;
    private Estudante[] estudante;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Estudante[] estudante) {
        this.nome = nome;
        this.estudante = estudante;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (estudante == null) return;
        for (Estudante estudantes: estudante){
            System.out.println(estudantes.getNome());
            System.out.println(estudantes.getIdade());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estudante[] getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante[] estudante) {
        this.estudante = estudante;
    }
}
