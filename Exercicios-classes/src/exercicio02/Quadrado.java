package exercicio02;
/* Classe Quadrado: Crie uma classe que modele um quadrado:

Atributos: Tamanho do lado
Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;
 */

public class Quadrado {
    private int lado;

    public int calcularArea() {
        return lado * lado;
    }

    public void mudarValorlado(int lado){
        this.lado = lado;
    }

    public int retornarValorlado(){
        return lado;
    }

}
