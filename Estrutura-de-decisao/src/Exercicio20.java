import java.util.Scanner;

public class Exercicio20 {
    /* Faça um Programa para leitura de três notas parciais de um aluno. 
    O programa deve calcular a média alcançada por aluno e presentar:
A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
A mensagem "Aprovado com Distinção", se a média for igual a 10 */
    
     public static void main(String[] args){
        double nota1, nota2, nota3, media;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma das notas: ");
        nota1 = sc.nextDouble();
        System.out.print("Informe uma das notas: ");
        nota2 = sc.nextDouble();
        System.out.print("Informe uma das notas: ");
        nota3 = sc.nextDouble();

        media = (nota1+nota2+nota3)/3;

        if(media >= 7 && media < 10 ){
            System.out.println("APROVADO");
        }
        else if(media == 10){
            System.out.println("Aprovado com Distinção");
        }
        else{
            System.out.println("REPROVADO");
        }
        sc.close();
    }
}
