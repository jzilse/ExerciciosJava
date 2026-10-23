package Exercicios.Associacao.teste;

import Exercicios.Associacao.dominio.Escola;
import Exercicios.Associacao.dominio.Estudante;

public class Estudantetest {
    static void main(String[] args) {
        Estudante estudante = new Estudante("João", 18);
        Estudante estudante2 = new Estudante("Samuel", 19);
        Estudante[] estudantes = {estudante, estudante2};

        Escola escola = new Escola("Carrossel");

        escola.setEstudante(estudantes);
        escola.imprime();

    }
}
