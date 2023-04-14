import java.util.Scanner;

public class exercicio05 {
/* Faça um programa para a leitura de duas notas parciais de um 
aluno. O programa deve calcular a média alcançada por aluno e apresentar:
    A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    A mensagem "Reprovado", se a média for menor do que sete;
    A mensagem "Aprovado com Distinção", se a média for igual a dez. */

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 2 notas de 0 a 10:");
        Double n1 = sc.nextDouble();
        Double n2 = sc.nextDouble();
        Double media = (n1 + n2) / 2;

        if(media > 10 || media < 0) {
            System.out.print("Nota invalida!");
        }
        else if(media == 10) {
            System.out.print("Parabens, nota maxima!");
        }
        else if(media >= 7) {
            System.out.print("Aprovado!");
        }
        else if(media < 7) {
            System.out.print("Reprovado!");
        }
        sc.close();
    } 
}
