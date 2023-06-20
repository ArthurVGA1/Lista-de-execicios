import java.util.Scanner;

public class Exercicio11 {
    /* As Organizações Tabajara resolveram dar um aumento de salário 
    aos seus colaboradores e lhe contraram para desenvolver o programa 
    que calculará os reajustes. Faça um programa que recebe o salário 
    de um colaborador e o reajuste segundo o seguinte critério, baseado 
    no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5% 
Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento. */
    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double salarioAtual, novoSalario, aumento;
        String percentual;

        System.out.println("Informe seu salario:");
        salarioAtual = sc.nextDouble();

        percentual = "";
        novoSalario = 0;
        aumento = 0;

        if(salarioAtual <= 280) {
            percentual = "20%";
            novoSalario = salarioAtual * 1.20;
            aumento = salarioAtual * 0.20;
        }
        else if(salarioAtual > 280 && salarioAtual <= 700) {
            percentual = "15%";
            novoSalario = salarioAtual * 1.15;
            aumento = salarioAtual * 0.15;
        }
        else if(salarioAtual > 700 && salarioAtual <= 1500) {
            percentual = "10%";
            novoSalario = salarioAtual * 1.10;
            aumento = salarioAtual * 0.10;
        }
        else if(salarioAtual > 1500) {
            percentual = "05%";
            novoSalario = salarioAtual * 1.05;
            aumento = salarioAtual * 0.05;
        }

        System.out.printf("Salario atual: R$%.2f\nPercentual de aumento: %s\nValor do aumento: %.2f\nNovo salario: %.2f", salarioAtual, percentual, aumento, novoSalario);

        sc.close();
    }
}
