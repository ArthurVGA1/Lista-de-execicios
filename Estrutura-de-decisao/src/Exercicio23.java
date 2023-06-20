import java.util.Scanner;

public class Exercicio23 {
    /* Faça um Programa que peça um número e informe se o número 
    é inteiro ou decimal. Dica: utilize uma função de arredondamento. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double num = sc.nextDouble();
        
        if (Math.floor(num) < num) {
            System.out.println("O número informado é decimal!");
        } else {
            System.out.println("O número informado é inteiro!");
        }
        sc.close();
    }
}
