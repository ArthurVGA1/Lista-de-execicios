import java.util.Scanner;

public class Exercicio22 {
    /* Faça um Programa que peça um número inteiro e determine se 
    ele é par ou impar. Dica: utilize o operador módulo (resto da divisão) */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = sc.nextInt();
        
        if (num%2 == 0) {
            System.out.println("O número informado é par!");
        } else { 
            System.out.println("O número informado é ímpar!");
        }
        sc.close();
    }
}
