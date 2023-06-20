import java.util.Scanner;

public class exercicio17 {
/* Faça um Programa para uma loja de tintas. O programa deverá pedir 
o tamanho em metros quadrados da área a ser pintada. Considere que a 
cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a 
tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões 
de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os 
respectivos preços em 3 situações:
    Comprar apenas latas de 18 litros;
    Comprar apenas galões de 3,6 litros;
    Misturar latas e galões, de forma que o desperdício de tinta seja 
    menor. Acrescente 10% de folga e sempre arredonde os valores para 
cima, isto é, considere latas cheias. */

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInforme em metros quadrados o tamanho da área que deseja pintar: ");
        double metrosQuadrados = sc.nextDouble();

        double litros = metrosQuadrados / 6;

        double latas = litros / 18;
        double custoLatas = latas * 80;

        double galoes = litros / 3.6;
        double custoGaloes = galoes * 25;

        int latasMistura = (int) Math.floor(litros / 18.0);
        int galoesMistura = (int) Math.ceil((litros - (latasMistura * 18.0)) / 3.6);
        double precoMistura = (latasMistura * custoLatas) + (galoesMistura * custoGaloes);

        System.out.printf("\nLitros necessarios para pintar toda está área: %.0f",  Math.ceil(litros));

        System.out.println("\nExistem 3 opções de compra para pintar está área.\n");
        
        System.out.printf("Opção 1: comprar apenas %.0f latas de 18 litros, por R$ %.2f\n", Math.ceil(litros / 18.0), custoLatas);
        System.out.printf("Opção 2: comprar apenas %.0f galões de 3,6 litros, por R$ %.2f\n", Math.ceil(litros / 3.6), custoGaloes);
        System.out.printf("Opção 3: misturar " + latasMistura + " latas de 18 litros e " + galoesMistura + " galões de 3,6 litros, por R$ ");
        System.out.printf("%.2f", precoMistura);

        sc.close();
    }
}
