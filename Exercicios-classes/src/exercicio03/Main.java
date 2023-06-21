package exercicio03;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Retangulo retangulo = new Retangulo();

    System.out.println("Informe, por gentileza, o valor do lado A: ");
    double lado1 = sc.nextDouble();

    System.out.println("Informe, por gentileza, o valor do lado B: ");
    double lado2 = sc.nextDouble();

    double resultado = retangulo.calcularAreaRetangulo(lado1, lado2);

    System.out.println("O resultado do cálculo da área do retangulo é: " + resultado);

  
    sc.close();

  }

    
}
