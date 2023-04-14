import java.util.Scanner;

public class exercicio02 {
  /* Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo. */

  public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe 1 numero: ");
    int n1 = sc.nextInt();

    if(n1 > 0) {
      System.out.println("O numero " + n1 + " e positivo.");
    }
    else {
      System.out.println("O numero " + n1 + " e negativo.");
    }
    sc.close();
  }
}