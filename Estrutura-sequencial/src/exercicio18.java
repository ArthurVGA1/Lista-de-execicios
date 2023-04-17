import java.util.Scanner;

public class exercicio18 {
    /* Faça um programa que peça o tamanho de um arquivo para 
    download (em MB) e a velocidade de um link de Internet 
    (em Mbps), calcule e informe o tempo aproximado de download 
    do arquivo usando este link (em minutos). */

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual e o tamanho do arquivo(em MB)?");
        Double file = sc.nextDouble();
        System.out.println("Qual e a velocidade da sua internet?");
        Double mega = sc.nextDouble();
        int time = (int) ((file * 8) / mega);

        int hora = time / 3600;
        int min = (time % 3600) / 60;
        int seg = time % 60;

        System.out.print("O tempo de download do seu arquivo sera aproximadamente de: " + hora + ":" + min + ":" + seg);

        sc.close();
    }
}
