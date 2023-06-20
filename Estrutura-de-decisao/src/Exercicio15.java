import java.util.Scanner;

public class Exercicio15 {
    /* Faça um Programa que peça os 3 lados de um triângulo. O 
    programa deverá informar se os valores podem ser um triângulo. 
    Indique, caso os lados formem um triângulo, se o mesmo é: 
    equilátero, isósceles ou escaleno. */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("informe um comprimento do primeiro lado do triangulo: ");
        double lado1 = sc.nextDouble();
        System.out.print("informe um comprimento do segundo lado do triangulo: ");
        double lado2 = sc.nextDouble();
        System.out.print("informe um comprimento do terceiro lado do triangulo: ");
        double lado3 = sc.nextDouble();
        
        if(lado1+lado2 > lado3 || lado3+lado1 > lado2 || lado2+ lado3 >lado1){
            if(lado1 == lado2 && lado1 == lado3){
                System.out.print("Esses valores formam um triangulo equilátero.");
            }
            else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Esses valores formam um triângulo Isôsceles.");
            }
            else {
                System.out.println("Esses valores formam um triângulo escaleno.");
            }
        }
        else{
            System.out.println("Os valores informados não podem informar um triâgulo.");
        }
        sc.close();
    }
}
