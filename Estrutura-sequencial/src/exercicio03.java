import java.util.Scanner;

public class exercicio03 {
    /*Faça um Programa que peça dois números e imprima a soma. */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 2 numeros para realizar uma soma.");

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int soma = n1 + n2;

        System.out.print("A soma dos numeros e " + soma + "!");
        input.close();
    }
    
}
