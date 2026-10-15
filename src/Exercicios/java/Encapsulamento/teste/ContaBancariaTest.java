package Exercicios.java.Encapsulamento.teste;

import Exercicios.java.Encapsulamento.dominio.ContaBancaria;

import java.util.Scanner;

public class ContaBancariaTest {
    static void main(String[] args) {
        ContaBancaria contabancaria = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);
        int operacao;

        System.out.println("Insira o titular");
        String titular = scanner.next();
        contabancaria.setTitular(titular);

        do{
            System.out.println("Digite: " +
                    " 1-Depositar" +
                    " 2-Sacar " +
                    " 3-Consultar" +
                    " 4-Encerrar");
            operacao = scanner.nextInt();

                if (operacao == 1) {
                    System.out.println("Insira um valor para deposito");
                    double deposito = scanner.nextDouble();
                    System.out.println("Valor do deposito: "+ contabancaria.depositar(deposito));
                    System.out.println("Saldo Atual: " + contabancaria.getSaldo());
                } else if (operacao == 2) {
                    System.out.println("Insira um valor para Saque");
                    double saque = scanner.nextDouble();
                    System.out.println("Valor do saque: "+ contabancaria.saque(saque));
                    System.out.println("Saldo Atual: " + contabancaria.getSaldo());
                } else if (operacao == 3) {
                    System.out.println("Titular da conta: " + contabancaria.getTitular());
                    System.out.println("Número da conta: " + contabancaria.getNumeroConta());
                    System.out.println("Saldo Atual: " + contabancaria.getSaldo());
                } else if (operacao == 4) {
                    System.out.println("Encerrando...");
                } else {
                    System.out.println("Operação inválida");
                }
            }while (operacao != 4);
    }
}
