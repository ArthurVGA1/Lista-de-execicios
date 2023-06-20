import java.util.Scanner;

public class Exercicio03 {
  /* Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme 
  a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. */

  public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite seu sexo, F para feminino e M para masculino: ");
    String opcao = sc.next();

    if(opcao.equalsIgnoreCase("m")) {
      System.out.print("Masculino.");
    }
    else if(opcao.equalsIgnoreCase("f")) {
      System.out.print("Feminino.");
    }
    else {
      System.out.print("Opcao invalida!");
    }
    sc.close();
  }
}