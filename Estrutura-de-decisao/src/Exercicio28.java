import java.util.Scanner;

public class Exercicio28 {
    /* O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
       Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos 
       de carne da promoção, porém não há limites para a quantidade de carne por cliente. 
       Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% 
       sobre o total da compra. Escreva um programa que peça o tipo e a quantidade de 
       carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: 
       tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar. */

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipoCarne, tipoPagamento;
        double peso, valor, desconto = 0, preco = 0;
        
        System.out.println("Informe o tipo da carne que deseja: FD = file duplo, AL = alcatra, PC = picanha.");
        tipoCarne = sc.next();
        System.out.println("informe o tipo do pagamento: Dinheiro, Cartao, cl = Cartão da Loja");
        tipoPagamento = sc.next();
        System.out.println("Informe quantos kilos dessa carne você deseja: ");
        peso = sc.nextDouble();
        
        if(tipoCarne.equals("FD") || tipoCarne.equals("fd")){
            if(peso <= 5){
                preco = 4.9;
                valor = peso*preco;
                if(tipoPagamento.equals("cl")){
                    desconto = valor*0.05;
                    valor = valor - desconto;
                }
                System.out.println("Tipo da carne: Filé Duplo");
                System.out.printf("Quantidade de carne: %.2f\n", peso);
                System.out.printf("Preco total: %.2f\n", peso*preco);
                System.out.println("Tipo de pagamento: "+ tipoPagamento);
                System.out.printf("Valor do desconto: %.2f\n", desconto);
                System.out.printf("Valor a pagar: %.2f\n", valor);
            }
            if(peso > 5){
                preco = 5.8;
                valor = peso*preco;
                if(tipoPagamento.equals("cl")){
                    desconto = valor*0.05;
                    valor = valor - desconto;
                }
                System.out.println("Tipo da carne: Filé Duplo");
                System.out.printf("Quantidade de carne: %.2f\n", peso);
                System.out.printf("Preco total: %.2f\n", peso*preco);
                System.out.println("Tipo de pagamento: "+ tipoPagamento);
                System.out.printf("Valor do desconto: %.2f\n", desconto);
                System.out.printf("Valor a pagar: %.2f\n", valor);
            }
        }
        if(tipoCarne.equals("AL") || tipoCarne.equals("al")){
            if(peso <= 5){
                preco = 5.9;
                valor = peso*preco;
                if(tipoPagamento.equals("cl")){
                    desconto = valor*0.05;
                    valor = valor - desconto;
                }
                System.out.println("Tipo da carne: Filé Duplo");
                System.out.printf("Quantidade de carne: %.2f\n", peso);
                System.out.printf("Preco total: %.2f\n", peso*preco);
                System.out.println("Tipo de pagamento: "+ tipoPagamento);
                System.out.printf("Valor do desconto: %.2f\n", desconto);
                System.out.printf("Valor a pagar: %.2f\n", valor);
            }
            if(peso > 5){
                preco = 6.8;
                valor = peso*preco;
                if(tipoPagamento.equals("cl")){
                    desconto = valor*0.05;
                    valor = valor - desconto;
                }
                System.out.println("Tipo da carne: Filé Duplo");
                System.out.printf("Quantidade de carne: %.2f\n", peso);
                System.out.printf("Preco total: %.2f\n", peso*preco);
                System.out.println("Tipo de pagamento: "+ tipoPagamento);
                System.out.printf("Valor do desconto: %.2f\n", desconto);
                System.out.printf("Valor a pagar: %.2f\n", valor);
            }
        }
        if(tipoCarne.equals("PC") || tipoCarne.equals("pc")){
            if(peso <= 5){
                preco = 6.9;
                valor = peso*preco;
                if(tipoPagamento.equals("cl")){
                    desconto = valor*0.05;
                    valor = valor - desconto;
                }
                System.out.println("Tipo da carne: Filé Duplo");
                System.out.printf("Quantidade de carne: %.2f\n", peso);
                System.out.printf("Preco total: %.2f\n", peso*preco);
                System.out.println("Tipo de pagamento: "+ tipoPagamento);
                System.out.printf("Valor do desconto: %.2f\n", desconto);
                System.out.printf("Valor a pagar: %.2f\n", valor);
            }
            if(peso > 5){
                preco = 7.8;
                valor = peso*preco;
                if(tipoPagamento.equals("cl")){
                    desconto = valor*0.05;
                    valor = valor - desconto;
                }
                System.out.println("Tipo da carne: Filé Duplo");
                System.out.printf("Quantidade de carne: %.2f\n", peso);
                System.out.printf("Preco total: %.2f\n", peso*preco);
                System.out.println("Tipo de pagamento: "+ tipoPagamento);
                System.out.printf("Valor do desconto: %.2f\n", desconto);
                System.out.printf("Valor a pagar: %.2f\n", valor);
            }
        }
        sc.close();
    }
}
