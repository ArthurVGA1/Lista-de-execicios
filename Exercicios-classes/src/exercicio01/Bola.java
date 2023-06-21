package exercicio01;
/* Classe Bola: Crie uma classe que modele uma bola:

Atributos: Cor, circunferência, material
Métodos: trocaCor e mostraCor */

public class Bola {
    public String cor, material;
    public int circunferencia;

    public void trocaCor(String novaCor) {
        this.cor = novaCor;
    }

    public String mostraCor() {
        return cor;
    }

}
