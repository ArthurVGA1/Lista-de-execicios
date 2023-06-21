package exercicio11;
/* Classe carro: Implemente uma classe chamada Carro com as seguintes propriedades:

Um veículo tem um certo consumo de combustível (medidos em km / litro) e uma certa 
quantidade de combustível no tanque.
O consumo é especificado no construtor e o nível de combustível inicial é 0.
Forneça um método andar( ) que simule o ato de dirigir o veículo por uma certa 
distância, reduzindo o nível de combustível no tanque de gasolina.
Forneça um método obterGasolina( ), que retorna o nível atual de combustível.
Forneça um método adicionarGasolina( ), para abastecer o tanque. Exemplo de uso: */

public class Carro {
    private double consumoCombustivel, nivelCombustivel;

    public Carro(double consumoLitro) {
        consumoCombustivel = consumoLitro;
        nivelCombustivel = 0;
    }
    public void andar(double distancia) {
        double consumoTotal = distancia / consumoCombustivel;
        
        if(consumoTotal <= nivelCombustivel) {
        nivelCombustivel -= consumoTotal;
        System.out.println("O carro andou " + distancia + "km.");
        }
        else {
        System.out.println("Falta combustivel");
        }
    }

    public void abastecerGasolina(double quantidadeGaslina) {
        nivelCombustivel = quantidadeGaslina;
    }

    public void obterGasolina(){
        System.out.println("Quantidade restante de combustivel " + nivelCombustivel);
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }
}
