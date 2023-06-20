import java.util.Scanner;

public class Exercicio17 {
    /* Faça um Programa que peça um número correspondente a um 
    determinado ano e em seguida informe se este ano é ou não bissexto. */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();
        

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.printf("O ano %d é bissexto.",ano);
        } else {
            System.out.printf("O ano %d não é bissexto.",ano);
        }
        sc.close();
    }
}
