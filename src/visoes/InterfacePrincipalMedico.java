/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visoes;

/**
 *
 * @author igor_
 */
public class InterfacePrincipalMedico extends javax.swing.JFrame {

    /**
     * Creates new form InterfacePrincipal
     */
    public InterfacePrincipalMedico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelMenuPrincipal = new javax.swing.JPanel();
        jLabelTipoAcesso = new javax.swing.JLabel();
        jButtonOpcoesPaciente = new javax.swing.JButton();
        jButtonOpcoesRelatorio = new javax.swing.JButton();
        jButtonLogoff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saúde & Cia - Menu Principal");
        setName("jFrameMenuPrincipal"); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanelMenuPrincipal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanelMenuPrincipal.setName("jPanelMenuPrincipal"); // NOI18N
        jPanelMenuPrincipal.setLayout(new java.awt.GridBagLayout());

        jLabelTipoAcesso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelTipoAcesso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTipoAcesso.setText("<html>Você está logado como: <b>Médico</b></html>");
        jLabelTipoAcesso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelTipoAcesso.setName("jLabelTipoAcesso"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanelMenuPrincipal.add(jLabelTipoAcesso, gridBagConstraints);
        jLabelTipoAcesso.getAccessibleContext().setAccessibleName("Tipo Acesso");

        jButtonOpcoesPaciente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonOpcoesPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconpaciente.png"))); // NOI18N
        jButtonOpcoesPaciente.setText("Pacientes");
        jButtonOpcoesPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        jButtonOpcoesPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonOpcoesPaciente.setName("jButtonOpcoesPaciente"); // NOI18N
        jButtonOpcoesPaciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonOpcoesPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpcoesPacienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanelMenuPrincipal.add(jButtonOpcoesPaciente, gridBagConstraints);

        jButtonOpcoesRelatorio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonOpcoesRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Relatorio.png"))); // NOI18N
        jButtonOpcoesRelatorio.setText("Relatórios");
        jButtonOpcoesRelatorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        jButtonOpcoesRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonOpcoesRelatorio.setName("jButtonOpcoesRelatorio"); // NOI18N
        jButtonOpcoesRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanelMenuPrincipal.add(jButtonOpcoesRelatorio, gridBagConstraints);

        jButtonLogoff.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonLogoff.setText("Logoff");
        jButtonLogoff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonLogoff.setName("jButtonLogoff"); // NOI18N
        jButtonLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoff(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelMenuPrincipal.add(jButtonLogoff, gridBagConstraints);
        jButtonLogoff.getAccessibleContext().setAccessibleName("ButtonLogoff");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jPanelMenuPrincipal, gridBagConstraints);
        jPanelMenuPrincipal.getAccessibleContext().setAccessibleName("PanelMenuPrincipal");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoff(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoff
        // TODO add your handling code here:
        this.setVisible(false);
        InterfaceLogin interfaceLogin = new InterfaceLogin();
        interfaceLogin.setVisible(true);
    }//GEN-LAST:event_logoff

    private void jButtonOpcoesPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpcoesPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOpcoesPacienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePrincipalADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogoff;
    private javax.swing.JButton jButtonOpcoesPaciente;
    private javax.swing.JButton jButtonOpcoesRelatorio;
    private javax.swing.JLabel jLabelTipoAcesso;
    private javax.swing.JPanel jPanelMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
