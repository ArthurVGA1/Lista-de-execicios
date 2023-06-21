package exercicio13;
/* Classe Funcionário: Implemente a classe Funcionário. Um empregado tem 
um nome (um string) e um salário(um double). Escreva um construtor com 
dois parâmetros (nome e salário) e métodos para devolver nome e salário. 
Escreva um pequeno programa que teste sua classe. */

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double consultarSalario(){
        return salario;
    }

    public double aumentarSalario(double percentual){
        salario += salario * (percentual / 100);
        return percentual;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}
