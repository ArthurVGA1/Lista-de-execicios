import java.util.Scanner;

public class exercicio05 {
    /*Faça um Programa que converta metros para centímetros. */
    /*Para ficar mais interessante eu fiz a opção de converter metros ou centimetros, 
    apesar de não entender muito bem como funciona */

    public static void main(String[]args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Digite m para converter metros para centimetros, ou c para converter centimetros para metros. ");

    String opcao = input.nextLine();
    

    if(opcao.equalsIgnoreCase("m")) {
        System.out.println("Digite quantos metros");
        Double metros = input.nextDouble();
        Double cent = metros * 100;
        System.out.println(metros + " e igual a " + cent + " em centimetros.");
    }
    else if(opcao.equalsIgnoreCase("c")) {
        System.out.println("Digite quantos centimetros");
        Double cent = input.nextDouble();
        Double metros = cent / 100;
        System.out.println(cent + " e igual a " + metros + " em centimetros.");
    }
    else {
        System.out.println("Opção inválida. Tente novamente.");
    }
    input.close();
}
}