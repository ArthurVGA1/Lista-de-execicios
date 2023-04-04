import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio13 { /* Contem o exercicio 12 */
        /* Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule 
        seu peso ideal, utilizando as seguintes fórmulas:
        A - Para homens: (72.7*h) - 58
        B - Para mulheres: (62.1*h) - 44.7 */
        
        public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("Voce quer calcular o peso ideal para o homem(h) ou a mulher(m)?");
        String opcao = sc.nextLine();

        if(opcao.equalsIgnoreCase("h")) {
            System.out.println("Qual e a altura do homem?");
            Double alt = sc.nextDouble();
            Double altH = 72.7 * alt - 58;
            System.out.println("O peso ideal para este homem e " + df.format(altH));
        }
        else if(opcao.equalsIgnoreCase("m")) {
            System.out.println("Qual a altura da mulher?");
            Double alt = sc.nextDouble();
            Double altM = 62.1 * alt - 44.7;
            System.out.println("O peso ideal para esta mulher e " + df.format(altM));
        }
        else {
            System.out.println("Opcao invalida!");
        }
        sc.close();
    }
}
