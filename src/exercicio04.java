import java.util.Scanner;

public class exercicio04 {
    /*Faça um Programa que peça as 4 notas bimestrais e mostre a média. */
    
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite as suas 4 notas brimestrais.");

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int total = n1 + n2 + n3 + n4;
        int media = total / 4;

        System.out.println("A sua media e: " + media);

        /*Aqui termina o codigo do exercicio 4 */
        /*Vou tentar fazer uma condicional de aprovação e reprovação */

        if(total >= 60) {
            System.out.println("Aprovado! Parabens!");
        }
        else {
            System.out.println("Reprovado!");
        }
        input.close();
    }
    
}
