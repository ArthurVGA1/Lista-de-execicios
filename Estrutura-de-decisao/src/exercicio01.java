import java.util.Scanner;

public class exercicio01 {
  /* Faça um Programa que peça dois números e imprima o maior deles. */

  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
  
    System.out.print("Informe 2 numeros: ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
  
    if(n1 > n2) {
      System.out.print(n1 + " e maior que " + n2);
    }
    else {
      System.out.print(n2 + " e maior que " + n1);
    }
    sc.close();
  }
}