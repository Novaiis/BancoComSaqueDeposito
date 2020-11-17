
package br.com.controle;


public class ContaPoupanca implements InterfaceConta{
    
    private double saldo;
    
    @Override
    public void depositar(double valor) {
        
      this.saldo += valor;

    }

    @Override
    public void sacar(double valor) {
        
        this.saldo -= valor;
   }

    @Override
    public double getSaldo() {
        
       return this.saldo;
    }
    
}   
