import java.util.Scanner;

public class Exercicio12 {
    /* Faça um programa para o cálculo de uma folha de pagamento, 
    sabendo que os descontos são do Imposto de Renda, que depende 
    do salário bruto (conforme tabela abaixo) e 3% para o Sindicato 
    e que o FGTS corresponde a 11% do Salário Bruto, mas não é 
    descontado (é a empresa que deposita). O Salário Líquido corresponde 
    ao Salário Bruto menos os descontos. O programa deverá pedir 
    ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, 
dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade 
de hora é 220. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da sua hora: ");
        double valorHora = sc.nextDouble();
        System.out.println("Informe a quantidade de horas ao mes: " );
        double horas = sc.nextDouble();
        double salario = horas * valorHora;

        if (salario <= 900) {
            System.out.println("Salario bruto: "+valorHora+"*"+horas);
            System.out.println(": R$"+ salario);
            System.out.println("Isento de IR");
            System.out.println("(-) INSS (10%)");
            System.out.println(": R$"+ (0.1*salario));
            System.out.println("(-) FGTS (11%)");
            System.out.println(": R$"+ (0.11*salario));
            System.out.println("(-) SNDCT (3%)");
            System.out.println(": R$"+ (0.03*salario));
            System.out.println("Total de descontos");
            System.out.println(": R$"+ (0.1*salario+0.03*salario));
            System.out.println("Salario Liquido");
            System.out.println(": R$"+ (salario-(0.1*salario+0.03*salario)));
        }
        else if (salario>900 && salario<=1500) {
            System.out.println("Salario bruto: "+valorHora+"*"+horas);
            System.out.println(": R$"+ salario);
            System.out.println("(-) IR (5%)");
            System.out.println(": R$"+ (0.05*salario));
            System.out.println("(-) INSS (10%)");
            System.out.println(": R$"+ (0.1*salario));
            System.out.println("(-) FGTS (11%)");
            System.out.println(": R$"+ (0.11*salario));
            System.out.println("(-) SNDCT (3%)");
            System.out.println(": R$"+ (0.03*salario));
            System.out.println("Total de descontos");
            System.out.println(": R$"+ (0.1*salario+0.05*salario+0.03*salario));
            System.out.println("Salario Liquido");
            System.out.println(": R$"+ (salario-(0.1*salario+0.05*salario+0.03*salario)));
        }
        else if (salario>900 && salario<=1500) {
            System.out.println("Salario bruto: "+valorHora+"*"+horas);
            System.out.println(": R$"+ salario);
            System.out.println("(-) IR (5%)");
            System.out.println(": R$"+ (0.05*salario));
            System.out.println("(-) INSS (10%)");
            System.out.println(": R$"+ (0.1*salario));
            System.out.println("(-) FGTS (11%)");
            System.out.println(": R$"+ (0.11*salario));
            System.out.println("(-) SNDCT (3%)");
            System.out.println(": R$"+ (0.03*salario));
            System.out.println("Total de descontos");
            System.out.println(": R$"+ (0.1*salario+0.05*salario+0.03*salario));
            System.out.println("Salario Liquido");
            System.out.println(": R$"+ (salario-(0.1*salario+0.05*salario+0.03*salario)));
        }
        else if (salario>1500 && salario<=2500) {
            System.out.println("Salario bruto: "+valorHora+"*"+horas);
            System.out.println(": R$"+ salario);
            System.out.println("(-) IR (10%)");
            System.out.println(": R$"+ (0.1*salario));
            System.out.println("(-) INSS (10%)");
            System.out.println(": R$"+ (0.1*salario));
            System.out.println("(-) FGTS (11%)");
            System.out.println(": R$"+ (0.11*salario));
            System.out.println("(-) SNDCT (3%)");
            System.out.println(": R$"+ (0.03*salario));
            System.out.println("Total de descontos");
            System.out.println(": R$"+ (0.1*salario+0.1*salario+0.03*salario));
            System.out.println("Salario Liquido");
            System.out.println(": R$"+ (salario-(0.1*salario+0.1*salario+0.03*salario)));
        }
        else if (salario>2500) {
            System.out.println("Salario bruto: "+valorHora+"*"+horas);
            System.out.println(": R$"+ salario);
            System.out.println("(-) IR (20%)");
            System.out.println(": R$"+ (0.2*salario));
            System.out.println("(-) INSS (10%)");
            System.out.println(": R$"+ (0.1*salario));
            System.out.println("(-) FGTS (11%)");
            System.out.println(": R$"+ (0.11*salario));
            System.out.println("(-) SNDCT (3%)");
            System.out.println(": R$"+ (0.03*salario));
            System.out.println("Total de descontos");
            System.out.println(": R$"+ (0.1*salario+0.2*salario+0.03*salario));
            System.out.println("Salario Liquido");
            System.out.println(": R$"+ (salario-(0.1*salario+0.2*salario+0.03*salario)));
        }
        sc.close();
    }
}
