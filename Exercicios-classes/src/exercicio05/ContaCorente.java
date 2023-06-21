package exercicio05;
/* Classe Conta Corrente: Crie uma classe para implementar uma conta corrente. 
A classe deve possuir os seguintes atributos: número da conta, nome do correntista 
e saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No construtor, 
saldo é opcional, com valor default zero e os demais atributos são obrigatórios. */

public class ContaCorente {
    private int numeroConta;
    private String  nomeCorrentista;
    private double saldo;
    
    public void Conta(int numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0; 
    }
    
    public int getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(int novoNumero){
        numeroConta = novoNumero;
    }

    public String getNomeCorretista(){
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String novoNome){
        nomeCorrentista = novoNome;
    }
    
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void alterarNome(String novoNome){
        nomeCorrentista = novoNome;
    }

    public double deposito(double deposito){
        saldo = deposito;
        return saldo;
    }

    public void sacar(double saque){
        if(saque > saldo) {
        System.out.println("Saldo insuficiente");
        }
        else {
        saldo -= saque;
        }
    }
}
