import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio09 { /* Contem o exercicio 10 */
    /* Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e
   * mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).  */
  /* Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit. */

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.##");

    System.out.println("Escolha a opcao: celsius(c) ou fahrenheit(f)");
    String opcao = input.nextLine();

    if (opcao.equalsIgnoreCase("c")) {
      System.out.print("Quantos graus fahrenheit: ");
      Double fah = input.nextDouble();
      Double cel = 5 * ((fah - 32) / 9);
      System.out.println(fah + "º fahrenheit = " + df.format(cel) + "º celsius.");
    } 
    else if (opcao.equalsIgnoreCase("f")) {
      System.out.print("Quantos graus celsius: ");
      Double cel = input.nextDouble();
      Double fah = (cel * 9 / 5) + 32;
      System.out.println(cel + "º celsius = " + df.format(fah) + "º fahrenheit.");
    } 
    else {
      System.out.print("Opcao invalida!");
    }
    input.close();
  }
}
