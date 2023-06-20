import java.util.Scanner;

public class Exercicio25 {
    /* Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. 
    As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação 
sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 
2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" 
e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente". */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd = 0;

        System.out.println("Responda as seguintes perguntas com Sim ou Não!");
        System.out.println("Telefonou para a vítima?");
        String answ = sc.next();

        if (answ.equals("Sim")){
            qtd += 1;
        }

        System.out.println("Esteve no local do crime?");
        answ = sc.next();
        if (answ.equals("Sim")){
            qtd += 1;
        }

        System.out.println("Mora perto da vítima?");
        answ = sc.next();
        if (answ.equals("Sim")){
            qtd += 1;
        }

        System.out.println("Devia para a vítima?");
        answ = sc.next();
        if (answ.equals("Sim")){
            qtd += 1;
        }

        System.out.println("Já trabalhou com a vítima?");
        answ = sc.next();
        if (answ.equals("Sim")){
            qtd += 1;
        }

        
        if (qtd == 0 || qtd == 1) {
            System.out.println("Classificação: INOCENTE");
        }  
        if (qtd == 2) {
            System.out.println("Classificação: SUSPEITA");
        } 
        if (qtd == 3 || qtd == 4) {
            System.out.println("Classificação: CÚMPLICE");
        } 
        if (qtd == 5) {
            System.out.println("Classificação: ASSASSINO");
        }
        sc.close();
    }
}
