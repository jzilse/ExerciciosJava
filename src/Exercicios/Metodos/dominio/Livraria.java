package Exercicios.Metodos.dominio;

public class Livraria {
    public void aplicarDesconto(Livro livro, double porcentagem){
        double desconto = livro.preco * (porcentagem / 100);

        livro.preco -= desconto;

        System.out.println(livro.preco);
    }
}
