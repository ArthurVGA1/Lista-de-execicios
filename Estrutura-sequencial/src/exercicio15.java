import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio15 {
/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas 
no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são 
descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um 
programa que nos dê:
A - salário bruto.
B - quanto pagou ao INSS.
C - quanto pagou ao sindicato.
D - o salário líquido.
E - calcule os descontos e o salário líquido, conforme a tabela abaixo:
    + Salário Bruto : R$
    - IR (11%) : R$
    - INSS (8%) : R$
    - Sindicato ( 5%) : R$
    = Salário Liquido : R$ */

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        Double salH, horaM, salB, ir, inss, sind, salL;

        System.out.println("Informe seu salario por hora e quantas horas voce trabalha no mes: ");
        salH = sc.nextDouble();
        horaM = sc.nextDouble();

        salB = salH * horaM;
        ir = salB * 0.11;
        inss = salB * 0.08;
        sind = salB * 0.05;
        salL = salB - ir - inss - sind;

        System.out.println("Salário Bruto : R$" + df.format(salB) + "\nIR (11%) : R$" + df.format(ir));
        System.out.println("INSS (8%) : R$" + df.format(inss) + "\nSindicato ( 5%) : R$" + df.format(sind));
        System.out.println("Salário Liquido : R$" + df.format(salL));

        sc.close();
    }
}