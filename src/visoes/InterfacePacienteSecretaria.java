/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visoes;

/**
 *
 * @author Tatiane
 */
public class InterfacePacienteSecretaria extends javax.swing.JFrame {

    /**
     * Creates new form InterfacePaciente
     */
    public InterfacePacienteSecretaria() {
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

        jPanelOpcoesPaciente = new javax.swing.JPanel();
        jButtonCriarPaciente = new javax.swing.JButton();
        jButtonListarPacientes = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanelOpcoesPaciente.setLayout(new java.awt.GridBagLayout());

        jButtonCriarPaciente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonCriarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/criaPaciente.png"))); // NOI18N
        jButtonCriarPaciente.setText("Criar Paciente");
        jButtonCriarPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        jButtonCriarPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCriarPaciente.setName("jButtonCriarPaciente"); // NOI18N
        jButtonCriarPaciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelOpcoesPaciente.add(jButtonCriarPaciente, gridBagConstraints);

        jButtonListarPacientes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonListarPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorios.png"))); // NOI18N
        jButtonListarPacientes.setText("Listar Pacientes");
        jButtonListarPacientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        jButtonListarPacientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonListarPacientes.setName("jButtonListarPacientes"); // NOI18N
        jButtonListarPacientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        jPanelOpcoesPaciente.add(jButtonListarPacientes, gridBagConstraints);

        jButtonVoltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black));
        jButtonVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVoltar.setName("jButtonVoltar"); // NOI18N
        jButtonVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        jPanelOpcoesPaciente.add(jButtonVoltar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        getContentPane().add(jPanelOpcoesPaciente, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InterfacePacienteSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePacienteSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePacienteSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePacienteSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePacienteSecretaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCriarPaciente;
    private javax.swing.JButton jButtonListarPacientes;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JPanel jPanelOpcoesPaciente;
    // End of variables declaration//GEN-END:variables
}
