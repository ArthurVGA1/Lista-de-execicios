import java.util.Scanner;

public class exercicio04 {
  /* Faça um Programa que verifique se uma letra digitada é vogal ou consoante. */

  public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um letra: ");
    String letra = sc.next();

    /* Posso usar a classe "matches()" para o codigo ficar menor */

    if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
      System.out.print("A letra é uma vogal!");
    }
    else {
      System.out.print("A letra é consoante!");
    }
    sc.close();
  }
}