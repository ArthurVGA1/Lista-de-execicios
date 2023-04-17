import java.util.Scanner;

public class exercicio16 {
    /* Faça um programa para uma loja de tintas. O programa deverá pedir 
    o tamanho em metros quadrados da área a ser pintada. Considere que a 
    cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a 
    tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao 
    usuário a quantidades de latas de tinta a serem compradas e o preço total. */

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos metros quadrados vao ser pintados?");
        Double area = sc.nextDouble();
        int lata = (int) Math.ceil(area / 54); 
        /* 54 é o litro por metro = 3 vezes os litros da lata = 18 */
        Double valor = lata * 80.0;
        /* Ou poderia coloca "valor = (((area / 3) / 18) * 80)" para ficar menor. */

        System.out.println("Quantidade de latas de tinta e " + lata);
        System.out.printf("O valor das tintas e R$%.2f", valor);

        sc.close();
    }
}
