package exercicio08;
/* Classe Macaco: Desenvolva uma classe Macaco,que possua os atributos nome 
e bucho (estomago) e pelo menos os métodos comer(), verBucho() e digerir(). 
Faça um programa ou teste interativamente, criando pelo menos dois macacos, 
alimentando-os com pelo menos 3 comidas diferentes e verificando o conteúdo 
do estomago a cada refeição. Experimente fazer com que um macaco coma o outro. 
É possível criar um macaco canibal? */

public class Macaco {
    private String nome, bucho;

    public Macaco(String nome) {
        this.nome = nome;
        this.bucho = "";
    }

    public String getNome() {
        return nome;
    }

    public void comer(String comida) {
        if (bucho.isEmpty()) {
        bucho += comida;
        } 
        else {
        bucho += ", " + comida;
        }
    }

    public void verBucho() {
        if (bucho.isEmpty()) {
        System.out.println(nome + " está com o bucho vazio.");
        } 
        else {
        System.out.println(nome + " comeu: " + bucho);
        }
    }

    public void digerir() {
        if (bucho.isEmpty()) {
        System.out.println(nome + " não tem nada no bucho para digerir.");
        } 
        else {
        System.out.println(nome + " está digerindo " + bucho + ".");
        bucho = "";
        }
    }
}
