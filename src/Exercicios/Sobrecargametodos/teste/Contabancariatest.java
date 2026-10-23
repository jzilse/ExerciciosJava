package Exercicios.Sobrecargametodos.teste;

import Exercicios.Sobrecargametodos.dominio.Contabancaria;

public class Contabancariatest {
    static void main(String[] args) {
        Contabancaria contabancaria = new Contabancaria("João", "008", 600, 400);
        contabancaria.imprime();
    }
}
