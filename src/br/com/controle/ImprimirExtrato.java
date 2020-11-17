
package br.com.controle;

import javax.swing.JOptionPane;

public class ImprimirExtrato {
    
    public void geradorConta (InterfaceConta conta) {
            JOptionPane.showMessageDialog(null,"Saldo Atual: " + conta.getSaldo());
}
}
