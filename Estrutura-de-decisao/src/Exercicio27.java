import java.util.Scanner;

public class Exercicio27 {
    /* Uma fruteira está vendendo frutas com a seguinte tabela de preços:
       Se o cliente comprar mais de 8 Kg em frutas ou o valor total da 
       compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre 
       este total. Escreva um algoritmo para ler a quantidade (em Kg) de 
       morangos e a quantidade (em Kg) de maças adquiridas e escreva o 
       valor a ser pago pelo cliente. */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double kgMorango, kgMaca, valorMorango, valorMaca, total;
        
        System.out.println("Informe quantos kilos de morango: ");
        kgMorango = sc.nextDouble();
        System.out.println("Informe quantos kilos de maçã: ");
        kgMaca = sc.nextDouble();
        
        if(kgMorango <= 5){
            valorMorango = kgMorango*2.50;
        }
        else{
            valorMorango = kgMorango*2.2;
        }
        if(kgMaca <= 5){
            valorMaca = kgMaca*1.8;
        }
        else{
            valorMaca = kgMaca*1.5;
        }

        total = valorMorango + valorMaca;
        System.out.printf("O valor total da compra foi de: R$ %.2f ", total);

        sc.close();
    }
}
