package Exercicios.Sobrecargametodos.teste;

import Exercicios.Sobrecargametodos.dominio.Calculadorageometrica;

public class Calculadorageotest {
    static void main(String[] args) {
        Calculadorageometrica calculadorageometrica = new Calculadorageometrica();
        calculadorageometrica.setGeral(2, true);
        calculadorageometrica.imprime();

    }
}
