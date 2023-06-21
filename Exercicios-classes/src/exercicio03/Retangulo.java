package exercicio03;
/* Classe Retangulo: Crie uma classe que modele um retangulo:

Atributos: LadoA, lado2 (ou Comprimento e Largura, ou Base e Altura, a escolher)
Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular Perímetro;
Crie um programa que utilize esta classe. Ele deve pedir ao usuário que informe as medidades 
de um local. Depois, deve criar um objeto com as medidas e calcular a quantidade de pisos e de 
rodapés necessárias para o local. */

public class Retangulo {
    public double lado1, lado2;

    public void mudarValorlado1Retangulo(double novoValorlado1) {
        this.lado1 = novoValorlado1;
    }

    public void mudarValorlado2Retangulo(double novoValorlado2) {
        this.lado2 = novoValorlado2;
    }

    public double retonarValorlado1() {
        return lado1;
    }

    public double retonarValorlado2() {
        return lado2;
    }

    public double calcularAreaRetangulo(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public double calcularPerimetroRetangulo() {
        return lado1 + lado2 + lado1 + lado2;
    }
}
