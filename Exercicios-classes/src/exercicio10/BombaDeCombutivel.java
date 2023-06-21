package exercicio10;
/* Classe Bomba de Combustível: Faça um programa completo utilizando classes e métodos que:

Possua uma classe chamada bombaCombustível, com no mínimo esses atributos:
tipoCombustivel.
valorLitro
quantidadeCombustivel
Possua no mínimo esses métodos:
abastecerPorValor( ) – método onde é informado o valor a ser abastecido e mostra a quantidade 
de litros que foi colocada no veículo
abastecerPorLitro( ) – método onde é informado a quantidade em litros de combustível e mostra 
o valor a ser pago pelo cliente.
alterarValor( ) – altera o valor do litro do combustível.
alterarCombustivel( ) – altera o tipo do combustível.
alterarQuantidadeCombustivel( ) – altera a quantidade de combustível restante na bomba.
OBS: Sempre que acontecer um abastecimento é necessário atualizar a quantidade de combustível 
total na bomba. */

public class BombaDeCombutivel {
    private String tipoCombustivel;
    private double valorLitro, quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valorAbastecido) {
        double litrosAbastecidos = valorAbastecido / valorLitro;
        if (litrosAbastecidos > quantidadeCombustivel) {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
        } else {
            quantidadeCombustivel -= litrosAbastecidos;
            System.out.println("Abastecimento realizado. Quantidade de litros: " + litrosAbastecidos);
        }
    }

    public void abastecerPorLitro(double litrosAbastecidos) {
        double valorPago = litrosAbastecidos * valorLitro;
        if (litrosAbastecidos > quantidadeCombustivel) {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
        } else {
            quantidadeCombustivel -= litrosAbastecidos;
            System.out.println("Abastecimento realizado. Valor a pagar: " + valorPago);
        }
    }

    public void alterarValor(double novoValor) {
        valorLitro = novoValor;
        System.out.println("Valor do litro de combustível alterado para: " + novoValor);
    }

    public void alterarCombustivel(String novoCombustivel) {
        tipoCombustivel = novoCombustivel;
        System.out.println("Tipo de combustível alterado para: " + novoCombustivel);
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        quantidadeCombustivel = novaQuantidade;
        System.out.println("Quantidade de combustível alterada para: " + novaQuantidade);
    }
}