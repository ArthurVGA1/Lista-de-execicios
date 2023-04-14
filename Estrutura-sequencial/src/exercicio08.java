import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual e o seu salario por hora, e qual sua jornada horas semanais?");
        Double salH = input.nextDouble();
        Double horaSem = input.nextDouble();
        Double salLiqSem = salH * horaSem;
    
        System.out.println("Voce esta ganhando " + salLiqSem + " por semana");
    
        input.close();
    
      }    
}
