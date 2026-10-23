package Exercicios.Metodos.teste;

import Exercicios.Metodos.dominio.ContaBancaria;

import java.util.Scanner;

public class ContaBancariaTest {
    static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    ContaBancaria contabancaria = new ContaBancaria();
    int operacao;
    double valor;

    System.out.println("Insira o Titular da conta");
    contabancaria.titular = leitor.next();

    do {
        System.out.println("Digite: " +
                " 1-Depositar" +
                " 2-Sacar" +
                " 3-Consultar" +
                " 4-Encerrar");
        operacao = leitor.nextInt();

        if (operacao == 1) {
            System.out.println("Insira o Valor para deposito");
            valor = leitor.nextDouble();
            contabancaria.depositar(valor);
            System.out.println("Saldo atual: R$" + contabancaria.saldo);

        } else if (operacao == 2) {
            System.out.println("Insira o valor do saque");
            valor = leitor.nextDouble();
            if (contabancaria.saldo <= 0) {
                System.out.println("Não é possível sacar");
            } else if (valor > contabancaria.saldo) {
                System.out.println("Valor maior que o que a conta possui. Saque indisponível");
            } else {
                contabancaria.sacar(valor);
                System.out.println("Saldo atual: R$" + contabancaria.saldo);
            }
        } else if (operacao == 3) {
            contabancaria.consultar();
        } else if (operacao == 4){
            System.out.println("Encerrando");
        }else {
            System.out.println("Operação inválida");
        }

    }while (operacao !=4);
    }
}
