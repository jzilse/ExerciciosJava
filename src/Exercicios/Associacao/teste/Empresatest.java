package Exercicios.Associacao.teste;

import Exercicios.Associacao.dominio.Participante;

public class Empresatest {
    static void main(String[] args) {
    Participante participante1 = new Participante("João");
    Participante participante2 = new Participante("Samuel");
    Participante participante3 = new Participante("Julia");
    Participante[] participantes = {participante1,participante2,participante3};

    for (Participante participante:participantes){
        participante.imprime();
    }


    }
}