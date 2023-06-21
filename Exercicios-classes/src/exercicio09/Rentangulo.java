package exercicio09;

public class Rentangulo {
    private Ponto pontoInicial;
    private int largura, altura;


    public Retangulo(Ponto pontoInicial, int largura, int altura) {
        this.pontoInicial = pontoInicial;
        this.largura = largura;
        this.altura = altura;
    }

    public Ponto encontrarCentro() {
        int centroX = pontoInicial.getX() + largura / 2;
        int centroY = pontoInicial.getY() + altura / 2;
        return new Ponto(centroX, centroY);
    }
}
