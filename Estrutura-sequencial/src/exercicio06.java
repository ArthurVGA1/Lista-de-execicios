import java.util.Scanner;

public class exercicio06 { 
    /*Faça um Programa que peça o raio de um círculo, calcule e mostre sua área. */
    /*Fiz parecido com o ultimo exercicio, com a opcao de calculo de area e perimetro. */
    
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite p para calcular o perimetro do circulo ou a para calcular a area: ");
        
        String opcao = input.nextLine();

        if(opcao.equalsIgnoreCase("a")) {
            System.out.print("Digite o raio do circulo: ");
            Double raio = input.nextDouble();
            Double area = 3.14 * Math.pow(raio, 2);
            System.out.print("A area do circulo e: " + area);
        }
        else if(opcao.equalsIgnoreCase("p")) {
            System.out.print("Digite o raio do circulo: ");
            Double raio = input.nextDouble();
            Double peri = 2 * 3.14 * raio;
            System.out.print("O perimetro do circulo é: " + peri);
        }
        else {
            System.out.println("Opção inválida. Tente novamente.");
        }

        input.close();
    }
    
}
