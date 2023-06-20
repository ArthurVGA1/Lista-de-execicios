import java.util.Scanner;

public class Exercicio14 {
    /* Faça um programa que lê as duas notas parciais obtidas 
    por um aluno numa disciplina ao longo de um semestre, e 
    calcule a sua média. A atribuição de conceitos obedece à 
    tabela abaixo: */
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor da primeira nota parcial: ");
        double nota1 = sc.nextDouble();
        System.out.print("Informe o valor da segunda nota parcial: ");
        double nota2 = sc.nextDouble();
        double media = (nota1+nota2)/2;
        
        if(media >= 6){
            if(media >=9 && media <= 10){
                System.out.println("Nota A");
            }
            else if (media >= 7.5 && media < 9) {
                System.out.println("Nota B");
            }
            else if(media < 7.5){
                System.out.println("Nota C");
            }
            System.out.println("Aprovado!");
        }
        else if (media < 6) {
            if(media >= 4){
                System.out.println("Nota D");
            }
            else if(media < 4){
                System.out.println("Nota E");
            }
            System.out.println("Reprovado!");
        }
        sc.close();
    }
}
