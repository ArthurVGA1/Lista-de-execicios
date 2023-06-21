package exercicio07;
/* Classe Bichinho Virtual:Crie uma classe que modele um Tamagushi (Bichinho Eletrônico):

Atributos: Nome, Fome, Saúde e Idade b. Métodos: Alterar Nome, Fome, Saúde e Idade; Retornar 
Nome, Fome, Saúde e Idade Obs: Existe mais uma informação que devemos levar em consideração, 
o Humor do nosso tamagushi, este humor é uma combinação entre os atributos Fome e Saúde, ou 
seja, um campo calculado, então não devemos criar um atributo para armazenar esta informação 
por que ela pode ser calculada a qualquer momento.
 */

public class BichinhoVirtual {
    private String nome;
    private int fome, tedio;
    
    public BichinhoVirtual(String nome) {
        this.nome = nome;
        this.fome = 0;
        this.tedio = 0;
    }
    
    public void alimentar(int comida) {
        fome -= comida;
        if (fome < 0) {
            fome = 0;
        }
    }
    
    public void brincar(int diversao) {
        tedio -= diversao;
        if (tedio < 0) {
            tedio = 0;
        }
    }
    
    public void passarTempo(int tempo) {
        fome += tempo;
        tedio += tempo;
    }
    
    public void imprimirEstado() {
        System.out.println("Nome: " + nome);
        System.out.println("Fome: " + fome);
        System.out.println("Tédio: " + tedio);
    } 
}
