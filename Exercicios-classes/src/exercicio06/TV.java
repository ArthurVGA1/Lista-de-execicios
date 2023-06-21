package exercicio06;
/* Classe TV: Faça um programa que simule um televisor criando-o como um 
objeto. O usuário deve ser capaz de informar o número do canal e aumentar 
ou diminuir o volume. Certifique-se de que o número do canal e o nível do 
volume permanecem dentro de faixas válidas. */

public class TV {
    private int numero, volume;

    public void aumentarVolume() {
        if (volume < 100) {
        volume++;
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
        volume--;
        }
    }

    public int getNumeroCanal() {
        return numero;
    }

    public void setNumeroCanal(int novoNumeroCanal) {
        this.numero = novoNumeroCanal;
    }

    public int getVolume() {
        return volume;
    }
}
