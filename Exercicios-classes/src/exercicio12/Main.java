package exercicio12;

public class Main {
    public static void main(String[] args) {
        ContaInvestimento conta = new ContaInvestimento(1000.00, 10.0);

        System.out.println("Saldo inicial: R$" + conta.getSaldo());

        for (int i = 1; i <= 5; i++) {
            conta.adicioneJuros();
            System.out.println("Saldo após " + i + "ª aplicação de juros: R$" + conta.getSaldo());
        }
    }
}
