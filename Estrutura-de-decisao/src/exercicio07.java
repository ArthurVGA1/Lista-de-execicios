import java.util.Scanner;

public class exercicio07 { /* Inclui o exercicio 6 */
  /* Faça um Programa que leia três números e mostre o maior e o menor deles. */

  public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    int n1, n2, n3, maior, menor;

    System.out.println("Digite 3 numeros: ");
    n1 = sc.nextInt();
    n2 = sc.nextInt();
    n3 = sc.nextInt();
    maior = Math.max(Math.max(n1, n2), n3);
    menor = Math.min(Math.min(n1, n2), n3);

    System.out.print("O maior numero e " + maior + ".\nE o menor numero e " + menor);
    
    sc.close();
  }
}