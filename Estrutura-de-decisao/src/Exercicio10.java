import java.util.Scanner;

public class Exercicio10 {
    /* Faça um Programa que pergunte em que turno você estuda. 
    Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
    Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" 
    ou "Valor Inválido!", conforme o caso. */
    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String resposta;

        System.out.println("Em que turno voce estuda?(M - matutino ou V - Vespertino ou N - Noturno)");
        resposta = sc.next();

        if(resposta.equalsIgnoreCase("M")) {
            System.out.println("Bom dia");
        }
        else if(resposta.equalsIgnoreCase("V")) {
            System.out.println("Bom Tarde");
        }
        else if(resposta.equalsIgnoreCase("N")) {
            System.out.println("Bom Noite");
        }
        else {
            System.out.println("Valor invalido!");
        }

        sc.close();
    }
}
