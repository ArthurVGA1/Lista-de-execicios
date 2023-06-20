import java.util.Scanner;

public class Exercicio21 {
    /* Faça um Programa para um caixa eletrônico. O programa deverá 
    perguntar ao usuário a valor do saque e depois informar quantas 
    notas de cada valor serão fornecidas. As notas disponíveis serão 
    as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o 
    máximo de 600 reais. O programa não deve se preocupar com a 
    quantidade de notas existentes na máquina.
Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas 
notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três 
notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1. */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota100 = 0, nota50 = 0, nota10 = 0, nota5 = 0, nota1 = 0;

        System.out.println("Informe o valor do saque: ");
        int valorSaque = sc.nextInt();
        
        if (valorSaque >= 10 && valorSaque <= 600) {
            if (valorSaque >= 100){
                nota100 = valorSaque/100;
                valorSaque = valorSaque%100;
            }
            if (valorSaque>=50) {
                nota50 = valorSaque/50;
                valorSaque = valorSaque%50;
            }
            if (valorSaque>=10) {
                nota10 = valorSaque/10;
                valorSaque = valorSaque%10;
            }
            if (valorSaque>=5){
                nota5 = valorSaque/5;
                valorSaque = valorSaque%5;
            }
            if (valorSaque>=1){
                nota1 = valorSaque;
            }
            System.out.println(nota100 + " nota(s) de R$100!");
            System.out.println(nota50 + " nota(s) de R$50!");
            System.out.println(nota10 + " nota(s) de R$10!");
            System.out.println(nota5 + " nota(s) de R$5!");
            System.out.println(nota1 + " nota(s) de R$1!");
        } else {
            System.out.println("Valor inválido!");
            System.exit(0);
        }
        sc.close();
    }
}
