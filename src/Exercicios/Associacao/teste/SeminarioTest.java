package Exercicios.Associacao.teste;

import Exercicios.Associacao.dominio.Aluno;
import Exercicios.Associacao.dominio.Local;
import Exercicios.Associacao.dominio.Professor;
import Exercicios.Associacao.dominio.Seminario;

import java.util.Scanner;

public class SeminarioTest {
    static void main(String[] args) {
        Seminario seminario = new Seminario("Tecnologia");
        Seminario seminario2 = new Seminario("IA");
        Seminario[] seminarios = {seminario, seminario2};
        Aluno aluno = new Aluno("João", 18);
        Aluno aluno2 = new Aluno("Matheus", 17);
        Aluno[] alunos = {aluno, aluno2};
        Professor professor = new Professor("Lucas", "Engenheiro de Software");
        Local local = new Local("Ceub-tg");

        seminario.setAlunos(alunos);
        seminario.setLocal(local);
        seminario.setProfessor(professor);
        seminario2.setAlunos(alunos);
        seminario2.setLocal(local);
        seminario2.setProfessor(professor);
        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);
        professor.setSeminario(seminarios);
        local.setSeminario(seminarios);

        seminario.imprime();
        System.out.println("----------------");
        seminario2.imprime();
        System.out.println("----------------");
        aluno.imprime();
        System.out.println("----------------");
        aluno2.imprime();
        System.out.println("----------------");
        professor.imprime();
        System.out.println("----------------");
        local.imprime();


    }
}
