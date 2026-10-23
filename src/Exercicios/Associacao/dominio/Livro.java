package Exercicios.Associacao.dominio;

public class Livro {
    private String nome;
    private Autor autor;

    public Livro(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Livros: "+ this.nome);
        if (autor != null) {
            System.out.println("Autor: "+ autor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
