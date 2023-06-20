import java.util.Scanner;

public class Exercicio19 {
    /* Faça um Programa que leia um número inteiro menor que 1000 e imprima 
    a quantidade de centenas, dezenas e unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula entre outros. 
Exemplo:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 
311, 111, 25, 20, 10, 21, 11, 1, 7 e 16 */

 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um numero menor que 1000: ");
        int num = sc.nextInt();

        if(num < 0 || num >=1000);{
            System.out.println("O número digitado está fora do intervalo desejado");

        }
        int centenas = num / 100;
        int dezenas = (num % 100)/10;
        int unidades = num % 10;

        System.out.print(num +" = ");

        if(centenas > 0) {
            System.out.print(centenas);
            if(centenas == 1) {
                System.out.print(" centena");
            } else {
                System.out.print(" centenas");
            }
            if(dezenas > 0 || unidades > 0) {
                System.out.print(" e ");
            }
        }

        if(dezenas > 0) {
            System.out.print(dezenas);
            if(dezenas == 1) {
                System.out.print(" dezena");
            } else {
                System.out.print(" dezenas");
            }
            if(unidades > 0) {
                System.out.print(" e ");
            }
        }

        if(unidades > 0) {
            System.out.print(unidades);
            if(unidades == 1) {
                System.out.print(" unidade");
            } else {
                System.out.print(" unidades");
            }
        }
    sc.close();
    }
}
