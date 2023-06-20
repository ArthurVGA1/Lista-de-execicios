import java.util.Scanner;

public class Exercicio24 {
    /* Faça um Programa que leia 2 números e em seguida pergunte 
    ao usuário qual operação ele deseja realizar. O resultado da 
    operação deve ser acompanhado de uma frase que diga se o número é:
par ou ímpar;
positivo ou negativo;
inteiro ou decimal. */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double num1 = sc.nextDouble();
        System.out.println("Informe outro número: ");
        double num2 = sc.nextDouble();
        System.out.println("Informe a operação desejada ( + , - , * , / )");
        double operacao = 0;
        char tipoOperacao;
        tipoOperacao = sc.next().charAt(0);
        
        if (tipoOperacao == '+') {
            operacao = num1 + num2;
        }
        if (tipoOperacao == '-') {
            operacao = num1 - num2;
        }
        if (tipoOperacao == '*') {
            operacao = num1 * num2;
        }
        if (tipoOperacao == '/') {
            operacao = num1 / num2;
        }
        System.out.println("O resultado é: " + operacao);
        if (operacao%2 == 0) {
            System.out.println("Par!");
        } 
        else {
            System.out.println("Ímpar!");
        }
        if (operacao == 0) {
            System.out.println("Neutro!");  
        }
        if (operacao > 0) {
            System.out.println("Positivo!");
        }
        if (operacao < 0) {
            System.out.println("Negativo!");
        }
        if (Math.floor(operacao) == operacao) {
            System.out.println("Inteiro!");
        } 
        else {
            System.out.println("Decimal!");
        }
        sc.close();
    }
}
