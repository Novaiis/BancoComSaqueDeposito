
package br.com.visao;

import br.com.controle.ContaCorrente;
import br.com.controle.ContaPoupanca;
import br.com.controle.ImprimirExtrato;
import javax.swing.JOptionPane;

public class Conta {
    public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(Double.valueOf(JOptionPane.showInputDialog("Digite o valor do deposito CC")));
		cc.sacar(Double.valueOf(JOptionPane.showInputDialog("Digite o valor do saque CC")));

		ContaPoupanca cp = new ContaPoupanca();
		cp.depositar(Double.valueOf(JOptionPane.showInputDialog("Digite o valor do deposito CA")));
		cp.sacar(Double.valueOf(JOptionPane.showInputDialog("Digite o valor do saque CA")));
		
		
		ImprimirExtrato gerador = new ImprimirExtrato();
		gerador.geradorConta(cc);
		gerador.geradorConta(cp);
	}

}


