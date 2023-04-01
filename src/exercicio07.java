import java.util.Scanner;

public class exercicio07 {
    /*Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário. */
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho de 1 dos lados do quadrado em centimetros: ");
        Double lado = input.nextDouble();
        Double area = lado * lado;
        
        System.out.println("A area do quadrado e: " + area);

        /*Colocando uma forma de opcao para converter os centimetros para metros */

        // System.out.println("Voce quer converter a area de centimetros para metros?(Digite s para sim e n para nao)");
        // String opcao = input.nextLine();

        // if(opcao.equalsIgnoreCase("s")) {
        //     Double metros = area / 100;
        //     System.out.println(area + "centrimetros sao" + metros + "metros.");            
        // }
        // else if(opcao.equalsIgnoreCase("n")) {
        //     System.out.print("OK");
        // }
        // else {
        //     System.out.print("Opcao invalida!");
        // }
        input.close();
    }
}
