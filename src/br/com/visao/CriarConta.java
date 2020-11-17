
package br.com.visao;

import br.com.controle.ContaCorrente;
import br.com.controle.ContaPoupanca;
import javax.swing.JOptionPane;

public class CriarConta extends javax.swing.JFrame {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

    public CriarConta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRcontap = new javax.swing.JRadioButton();
        jRcontac = new javax.swing.JRadioButton();
        jRsaque = new javax.swing.JRadioButton();
        jRdeposito = new javax.swing.JRadioButton();
        jBefetuar = new javax.swing.JButton();
        jLresultado = new javax.swing.JLabel();
        jTvalor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digitar o valor:");

        buttonGroup2.add(jRcontap);
        jRcontap.setText("Conta Poupança");

        buttonGroup2.add(jRcontac);
        jRcontac.setText("Conta Corrente");

        buttonGroup1.add(jRsaque);
        jRsaque.setText("Saque");

        buttonGroup1.add(jRdeposito);
        jRdeposito.setText("Deposito");

        jBefetuar.setText("Resultado");
        jBefetuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBefetuarActionPerformed(evt);
            }
        });

        jLresultado.setText("0.00");

        jTvalor.setColumns(6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRcontap)
                            .addComponent(jRsaque)
                            .addComponent(jLresultado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRcontac)
                            .addComponent(jRdeposito))))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jBefetuar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRcontap)
                    .addComponent(jRcontac))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRsaque)
                    .addComponent(jRdeposito))
                .addGap(18, 18, 18)
                .addComponent(jBefetuar)
                .addGap(18, 18, 18)
                .addComponent(jLresultado)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBefetuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBefetuarActionPerformed
   if(jTvalor.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Obrigatorio");
        }
        else{
            try {
                if(jRcontac.isSelected()){
                    if(jRdeposito.isSelected()){
                        cc.depositar(Double.valueOf(jTvalor.getText()));
                        jLresultado.setText("O saldo da Conta Corrente é "+cc.getSaldo());
                }
                    else if(jRsaque.isSelected()){
                        if(cc.getSaldo() >= Double.valueOf(jTvalor.getText())){
                        cc.sacar(Double.valueOf(jTvalor.getText()));

                            jLresultado.setText("O saldo da Conta Corrente é "+cc.getSaldo());
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
                            jTvalor.setText("");
                            jTvalor.requestFocus();
                        }
                }
                }
                else if(jRcontap.isSelected()){
                    if(jRdeposito.isSelected()){
                        cp.depositar(Double.valueOf(jTvalor.getText()));
                        jLresultado.setText("O saldo da Conta Poupança é "+cp.getSaldo());
                }
                    else if(jRsaque.isSelected()){
                        if(cp.getSaldo() >= Double.valueOf(jTvalor.getText())){
                        cp.sacar(Double.valueOf(jTvalor.getText()));    
                            jLresultado.setText("O saldo da Conta Poupança é "+cp.getSaldo());
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
                            jTvalor.setText("");
                            jTvalor.requestFocus();
                        }
                }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Apenas Números");
                jTvalor.requestFocus();
            }
           }     
    }//GEN-LAST:event_jBefetuarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBefetuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLresultado;
    private javax.swing.JRadioButton jRcontac;
    private javax.swing.JRadioButton jRcontap;
    private javax.swing.JRadioButton jRdeposito;
    private javax.swing.JRadioButton jRsaque;
    private javax.swing.JTextField jTvalor;
    // End of variables declaration//GEN-END:variables
}
