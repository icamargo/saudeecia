/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visoes;

import javax.swing.JOptionPane;

/**
 *
 * @author igor_
 */
public class InterfaceLogin extends javax.swing.JFrame {
    public static String tipoLogin;

    /**
     * Creates new form InterfaceLogin
     */
    public InterfaceLogin() {
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

        jButton1 = new javax.swing.JButton();
        jPanelLogin = new javax.swing.JPanel();
        jLabelLogoLogin = new javax.swing.JLabel();
        jLabelTxtLogin = new javax.swing.JLabel();
        jButtonAdministrador = new javax.swing.JButton();
        jButtonSecretaria = new javax.swing.JButton();
        jButtonMedico = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saúde & Cia - Login");
        setName("InterfaceLogin"); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanelLogin.setName("PainelLogin"); // NOI18N
        jPanelLogin.setLayout(new java.awt.GridBagLayout());

        jLabelLogoLogin.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabelLogoLogin.setForeground(new java.awt.Color(0, 204, 204));
        jLabelLogoLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/saudeECia..png"))); // NOI18N
        jLabelLogoLogin.setText("Clínica Médica Saúde & Cia");
        jLabelLogoLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelLogoLogin.setName("jLabelLogoLogin"); // NOI18N
        jLabelLogoLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanelLogin.add(jLabelLogoLogin, gridBagConstraints);

        jLabelTxtLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelTxtLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTxtLogin.setText("Escolha o Tipo de Login:");
        jLabelTxtLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelTxtLogin.setName("jLabelTxtLogin"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanelLogin.add(jLabelTxtLogin, gridBagConstraints);

        jButtonAdministrador.setText("Administrador");
        jButtonAdministrador.setName("jButtonAdministrador"); // NOI18N
        jButtonAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdministradorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanelLogin.add(jButtonAdministrador, gridBagConstraints);

        jButtonSecretaria.setText("Secretaria");
        jButtonSecretaria.setName("jButtonSecretaria"); // NOI18N
        jButtonSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSecretariaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanelLogin.add(jButtonSecretaria, gridBagConstraints);

        jButtonMedico.setText("Médico");
        jButtonMedico.setName("jButtonMedico"); // NOI18N
        jButtonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedicoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanelLogin.add(jButtonMedico, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 143;
        gridBagConstraints.insets = new java.awt.Insets(97, 140, 103, 160);
        getContentPane().add(jPanelLogin, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministradorActionPerformed
        // TODO add your handling code here:
        tipoLogin = "Administrador";
        this.setVisible(false);
        InterfacePrincipalADM interfacePrincipalADM = new InterfacePrincipalADM();
        interfacePrincipalADM.setVisible(true);
    }//GEN-LAST:event_jButtonAdministradorActionPerformed

    private void jButtonSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSecretariaActionPerformed
        // TODO add your handling code here:
        tipoLogin = "Secretária";
        this.setVisible(false);
        InterfacePrincipalSecretaria interfacePrincipalSecretaria = new InterfacePrincipalSecretaria();
        interfacePrincipalSecretaria.setVisible(true);
    }//GEN-LAST:event_jButtonSecretariaActionPerformed

    private void jButtonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedicoActionPerformed
        // TODO add your handling code here:
        tipoLogin = "Médico";
        this.setVisible(false);
        InterfacePrincipalMedico interfacePrincipalMedico = new InterfacePrincipalMedico();
        interfacePrincipalMedico.setVisible(true);
    }//GEN-LAST:event_jButtonMedicoActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdministrador;
    private javax.swing.JButton jButtonMedico;
    private javax.swing.JButton jButtonSecretaria;
    private javax.swing.JLabel jLabelLogoLogin;
    private javax.swing.JLabel jLabelTxtLogin;
    private javax.swing.JPanel jPanelLogin;
    // End of variables declaration//GEN-END:variables
}
