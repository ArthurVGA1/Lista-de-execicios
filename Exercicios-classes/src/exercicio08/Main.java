package exercicio08;

public class Main {
    public static void main(String[] args) {
        Macaco macaco1 = new Macaco("Tarzan");
        Macaco macaco2 = new Macaco("Geremias");

        macaco1.comer("Banana");
        macaco2.comer("Banana");

        macaco1.verBucho();
        macaco2.verBucho();

        macaco1.comer("Mamao");
        macaco2.comer("Manga");

        macaco1.verBucho();
        macaco2.verBucho();

        macaco1.digerir();
        macaco2.digerir();

        macaco1.verBucho();
        macaco2.verBucho();


        macaco1.comer(macaco2.getNome());
        macaco1.verBucho();

    }
}

