import java.util.Scanner;

public class Exercicio18 {
    /* Faça um Programa que peça uma data no formato dd/mm/aaaa 
    e determine se a mesma é uma data válida. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o dia: ");
        int dia = sc.nextInt();
        System.out.println("Informe o mes: ");
        int mes = sc.nextInt();
        System.out.println("Informe o ano: ");
        int ano = sc.nextInt();
        short valido=0;
        
        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
            if (dia<=31) {
                valido += 1;
            }
        }
        if (mes==4||mes==6||mes==9||mes==11) {
            if (dia<=30) {
                valido += 1;
            }
        }
        if (mes==2) {
            if (ano%4==0 && ano%100!=0 || ano%400==0) {
                if (dia<=29) {
                    valido += 1;
                }
            } else if (dia<=28) {
                valido += 1;
            }
        }
        if (valido==4) {
            System.out.println("Data Valida!");
        } else {
            System.out.println("Data Invalida!");
        }
        sc.close();
    }
}
