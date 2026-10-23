package Exercicios.Associacao.teste;

import Exercicios.Associacao.dominio.Autor;
import Exercicios.Associacao.dominio.Livro;

import java.util.Scanner;

public class LivroTest {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do Autor");
        String nomeAutor = scanner.nextLine();

        System.out.println("Insira o nome dos Livros desse autor");
        String nomeLivros = scanner.nextLine();

        Autor autor = new Autor(nomeAutor);
        Livro livro = new Livro(nomeLivros);

        Livro[] livros = new Livro[]{livro};

        autor.setLivro(livros);
        livro.setAutor(autor);

        autor.imprime();
        System.out.println("---------------");
        livro.imprime();
        System.out.println("---------------");
    }
}
