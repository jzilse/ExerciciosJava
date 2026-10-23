package Exercicios.Metodos.dominio;

public class CalculdoraEstatistica {
    public void calcularMedia(double... numeros){
        double media = 0;
        double soma = 0;
        for (double num : numeros) {
           soma += num;
        }
        media = soma / numeros.length;
        System.out.println(media);

    }
}
