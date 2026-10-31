package Exercicios.Heranca.teste;

import Exercicios.Heranca.dominio.MembroRegular;
import Exercicios.Heranca.dominio.MembroVip;

import java.util.Scanner;

public class Membrotest {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu Cpf: ");
        String cpf = scanner.nextLine();

        MembroVip membroVip = new MembroVip(nome, cpf);
        membroVip.validarAcesso();
        membroVip.calcularMensalidade();
        System.out.println("---------------");

        MembroRegular membroRegular = new MembroRegular(nome , cpf);
        membroRegular.validarAcesso();
        membroRegular.calcularMensalidade();
    }
}
