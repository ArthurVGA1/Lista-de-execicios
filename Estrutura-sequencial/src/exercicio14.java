import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio14 {
  /* João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento 
  diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo 
  regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por 
  quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de 
  peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite 
  e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com 
  as mensagens adequadas. */

  public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    
    System.out.print("Informe a pesagem dos peixes: ");
    Double KgP = sc.nextDouble();

    if(KgP > 50) {
      Double exc = KgP - 50;
      Double multa = exc * 4.00;
      System.out.println("O valor da multa e R$" + df.format(multa) + ", sobre a quantidade de " + KgP + " quilos.");
    }
    else {
      System.out.print("Não a quilos execedentes, page o valor normal.");
    }
    sc.close();
  }
}