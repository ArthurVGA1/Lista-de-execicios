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

    Public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos metros quadrados voce deseja pintar: ");
        Double area = sc.nextDouble();
        int tinta = (int) Math.ceil(area / 108);
        Double valor = tinta * 80.0; 
    }
}
