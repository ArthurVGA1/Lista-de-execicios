package exercicio09;
import java.util.Scanner;
import exercicio03.Retangulo;
/* Classe Ponto e Retangulo: Faça um programa completo utilizando funções e classes que:

Possua uma classe chamada Ponto, com os atributos x e y.
Possua uma classe chamada Retangulo, com os atributos largura e altura.
Possua uma função para imprimir os valores da classe Ponto
Possua uma função para encontrar o centro de um Retângulo.
Você deve criar alguns objetos da classe Retangulo.
Cada objeto deve ter um vértice de partida, por exemplo, o vértice inferior esquerdo do 
retângulo, que deve ser um objeto da classe Ponto.
A função para encontrar o centro do retângulo deve retornar o valor para um objeto do 
tipo ponto que indique os valores de x e y para o centro do objeto.
O valor do centro do objeto deve ser mostrado na tela
Crie um menu para alterar os valores do retângulo e imprimir o centro deste retângulo. */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ponto pontoInicial = new Ponto(0, 0);
        Retangulo retangulo = new Retangulo(pontoInicial, 5, 3);

        int i;
        do {
            System.out.print("Escolha uma opção: ");
            System.out.println("1. Alterar valores do retângulo");
            System.out.println("2. Imprimir centro do retângulo");
            System.out.println("3. Sair");

            i = sc.nextInt();

            switch (i) {
                case 1:
                    System.out.print("Digite a largura do retângulo: ");
                    int largura = sc.nextInt();
                    System.out.print("Digite a altura do retângulo: ");
                    int altura = sc.nextInt();
                    retangulo = new Retangulo(pontoInicial, largura, altura);
                    System.out.println("Valores do retângulo atualizados!");
                    break;
                case 2:
                    Ponto centro = retangulo.encontrarCentro();
                    centro.imprimir();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (i != 3);
    }
}
