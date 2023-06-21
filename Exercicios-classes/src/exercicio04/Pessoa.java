package exercicio04;
/* Classe Pessoa: Crie uma classe que modele uma pessoa:

Atributos: nome, idade, peso e altura
Métodos: Envelhercer, engordar, emagrecer, crescer. Obs: Por padrão, a cada 
ano que nossa pessoa envelhece, sendo a idade dela menor que 21 anos, ela 
deve crescer 0,5 cm. */

public class Pessoa {
    public String nome;
    public int idade, peso;
    public double altura;

    public int envelhecer() {
        return idade++;
    }

    public int engordar() {
        return peso++;
    }

    public int emagrecer() {
        return peso--;
    }

    public double crescer(double altura) {
        if (idade < 21) {
        return altura + 0.5;
        } 
        else {
        return altura++;
        }
    }    
}
