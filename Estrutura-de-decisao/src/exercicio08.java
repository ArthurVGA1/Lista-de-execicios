import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio08 {
  /* Faça um programa que pergunte o preço de três produtos e informe qual
  produto você deve comprar, sabendo que a decisão é sempre pelo mais barato */

  public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    Double n1, n2, n3, menor;

    System.out.println("Digite o preco de 3 produtos: ");
    n1 = sc.nextDouble();
    n2 = sc.nextDouble();
    n3 = sc.nextDouble();
    menor = Math.min(Math.min(n1, n2), n3);

    System.out.print("O produto com o menor valor e " + df.format(menor));
    
    sc.close();
  }
}