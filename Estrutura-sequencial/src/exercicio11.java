import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio11 {
    /*Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
    A - o produto do dobro do primeiro com metade do segundo.
    B - a soma do triplo do primeiro com o terceiro.
    C - o terceiro elevado ao cubo. */

     public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int n1, n2, a;
        Double n3, b, c;

        System.out.println("Informe 2 numeros inteiros e 1 numero real:");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextDouble();

        a = (n1 * 2) + (n2 / 2);
        b = 3 * n1 + n3;
        c = Math.pow(n3, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é " + a);
        System.out.println("A soma do triplo do primeiro com o terceiro é " + b);
        System.out.println("O terceiro elevado ao cubo é " + df.format(c));

        input.close();
     }
}