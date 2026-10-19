package Exercicios.java.Sobrecargametodos.dominio;

public class Calculadorageometrica {
    private double retangulo;
    private double quadrado;
    private double circulo;
    private double valor1;
    private double valor2;


    public void imprime(){
        System.out.println(this.getRetangulo());
        System.out.println(this.getQuadrado());
        System.out.println(this.getCirculo());
    }

    public void setGeral(double lado){
        this.quadrado = lado * lado;
    }

    public void setGeral(double base, double altura){
        this.retangulo = base * altura;
    }
    public void setGeral(double raio, boolean arredonda){
        double pi = 3.14;
        this.circulo = pi * (raio * raio);
    }
    public double getQuadrado() {
        return quadrado;
    }

    public double getRetangulo() {
        return retangulo;
    }

    public double getCirculo() {
        return circulo;
    }
}
