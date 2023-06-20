import java.util.Scanner;

public class Exercicio26 {
    /* Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool:
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro
Gasolina:
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia o 
número de litros vendidos, o tipo de combustível (codificado da seguinte forma: 
A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se 
que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90. */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valor = 0.0, litros = 0.0;
        char combustivel;
        
        System.out.println("Digite o tipo do combustivel que voce deseja G para gasolina ou A para alcool: ");
        combustivel = sc.next().charAt(0);
        System.out.println("Digite quantos litros do combustivel: ");
        litros = sc.nextDouble();
        
        if(combustivel == 'G'){
            if(litros <= 20){
                valor = litros*2.4;
            }
            if(litros > 20){
                valor = litros*2.35;
            }
        }
        if(combustivel == 'A'){
            if(litros <= 20){
                valor = litros*1.843;
            }
            if(litros > 20){
                valor = litros*1.805;
            }
        }
        System.out.println("O valor a ser pago é: R$"+ valor);

        sc.close();
    }
}
