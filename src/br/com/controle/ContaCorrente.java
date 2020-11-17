
package br.com.controle;

public class ContaCorrente implements InterfaceConta {
    private double saldo;
    private double taxaOperacao = 1.00;
    
    @Override
    public void depositar (double valor) {
        this.saldo += valor - taxaOperacao;
    }

    @Override
    public void sacar(double valor) {
        
    this.saldo -= valor + taxaOperacao;
    }

    @Override
    public double getSaldo() {
    
    return this.saldo;    
     }
}
