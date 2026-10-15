package Exercicios.java.Metodos.teste;

import Exercicios.java.Metodos.dominio.Livraria;
import Exercicios.java.Metodos.dominio.Livro;

import java.util.Scanner;

public class LivrariaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro livro1 = new Livro();
        Livraria livraria = new Livraria();

        livro1.titulo = "Os 3 porquinhos";
        livro1.preco = 150;
        System.out.println("Preço original: R$" + livro1.preco);

        livraria.aplicarDesconto(livro1, 10);

        System.out.println("Preço atualizado: R$" + livro1.preco);

    }

}
