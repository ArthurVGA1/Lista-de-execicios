import java.util.Scanner;

public class exercicio02 {
    /*Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número] */
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva um numero.");

        int n1 = input.nextInt();

        System.out.print("O numero digitado foi: " + n1);
        input.close();
    }
}