import java.util.Scanner;

public class Exercicio16 {
    /* Faça um programa que calcule as raízes de uma equação do segundo 
    grau, na forma ax2 + bx + c. O programa deverá pedir os valores de 
    a, b e c e fazer as consistências, informando ao usuário nas seguintes 
    situações:
Se o usuário informar o valor de A igual a zero, a equação não é do segundo 
grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
Se o delta calculado for negativo, a equação não possui raizes reais. 
Informe ao usuário e encerre o programa;
Se o delta calculado for igual a zero a equação possui apenas uma raiz real; 
informe-a ao usuário;
Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário; */

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe A: ");
        int a = sc.nextInt();
        
        int b =0,c=0, x1=0, x2=0;
        if (a==0) {
            System.out.println("Valor Invalido");
        } else {
            System.out.println("Informe B");
            b = sc.nextInt();
            System.out.println("Informe C");
            c = sc.nextInt();
        }    
        int delta = b*b -4*a*c;
        if (delta<0){
            System.out.println("A equacao nao possui raizes reais");
        } else {
            x1 = (int)(-b + Math.sqrt(delta)) / 2 * a;
            x2 = (int)(-b - Math.sqrt(delta)) / 2 * a;
        }
        if (delta==0){
            System.out.println("Apenas uma raiz real: "+ x1);
        } else {
            System.out.println("Duas raizes reais: "+x1+"/"+x2);
        }
        sc.close();
    }    
}
