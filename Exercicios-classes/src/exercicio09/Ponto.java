package exercicio09;

public class Ponto {
    private double x, y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprimir() {
        System.out.println("Coordenadas do ponto: (" + x + ", " + y + ")");
    }
}
