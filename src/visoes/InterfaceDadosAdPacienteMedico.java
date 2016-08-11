/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visoes;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author igor_
 */
public class InterfaceDadosAdPacienteMedico extends javax.swing.JFrame {
    /**
     * Creates new form InterfaceCadConsulta
     */
    public InterfaceDadosAdPacienteMedico() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroupFumaSimNao = new javax.swing.ButtonGroup();
        buttonGroupBebeSimNao = new javax.swing.ButtonGroup();
        buttonGroupColesterol = new javax.swing.ButtonGroup();
        buttonGroupDiabete = new javax.swing.ButtonGroup();
        buttonGroupDoencasCardiacas = new javax.swing.ButtonGroup();
        jPanelDadosAdcPaciente = new javax.swing.JPanel();
        jLabelFuma = new javax.swing.JLabel();
        jLabelBebe = new javax.swing.JLabel();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jRadioButtonBebeNao = new javax.swing.JRadioButton();
        jRadioButtonSim = new javax.swing.JRadioButton();
        jRadioButtonFumaSim = new javax.swing.JRadioButton();
        jRadioButtonFumaNao = new javax.swing.JRadioButton();
        jLabelDiabete = new javax.swing.JLabel();
        jRadioButtonDiabetelBaixo = new javax.swing.JRadioButton();
        jRadioButtonDiabeteAceitavel = new javax.swing.JRadioButton();
        jRadioButtonDiabeteAlto = new javax.swing.JRadioButton();
        jLabelColesterol = new javax.swing.JLabel();
        jRadioButtonColesterolBaixo = new javax.swing.JRadioButton();
        jRadioButtonColesterolAceitavel = new javax.swing.JRadioButton();
        jRadioButtonColesterolAlto = new javax.swing.JRadioButton();
        jLabelDoencaCardiaca = new javax.swing.JLabel();
        jLabelCirurgia = new javax.swing.JLabel();
        jLabelAlergia = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPaneCirurgias = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPaneAlergias = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jRadioButtonDoencaCardiacaSim = new javax.swing.JRadioButton();
        jRadioButtonDoencaCardiacaNao = new javax.swing.JRadioButton();
        jTextField = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saúde & Cia - Cadastro de Consulta");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanelDadosAdcPaciente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanelDadosAdcPaciente.setName("jPanelDadosAdcPaciente"); // NOI18N
        jPanelDadosAdcPaciente.setLayout(new java.awt.GridBagLayout());

        jLabelFuma.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelFuma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFuma.setText("Fuma:");
        jLabelFuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelFuma.setName("jLabelFuma"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jLabelFuma, gridBagConstraints);

        jLabelBebe.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelBebe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBebe.setText("Bebe:");
        jLabelBebe.setName("jLabelBebe"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jLabelBebe, gridBagConstraints);
        jLabelBebe.getAccessibleContext().setAccessibleName("LabelHora");

        jButtonAtualizar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAtualizar.setName("jButtonAtualizar"); // NOI18N
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 30);
        jPanelDadosAdcPaciente.add(jButtonAtualizar, gridBagConstraints);
        jButtonAtualizar.getAccessibleContext().setAccessibleName("jButtonCriar");

        jButtonCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancelar.setName("jButtonCancelar"); // NOI18N
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelDadosAdcPaciente.add(jButtonCancelar, gridBagConstraints);

        buttonGroupBebeSimNao.add(jRadioButtonBebeNao);
        jRadioButtonBebeNao.setText("NÃO");
        jRadioButtonBebeNao.setName("jRadioButtonBebeNao"); // NOI18N
        jRadioButtonBebeNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBebeNaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jRadioButtonBebeNao, gridBagConstraints);

        buttonGroupBebeSimNao.add(jRadioButtonSim);
        jRadioButtonSim.setText("SIM");
        jRadioButtonSim.setName("jRadioButtonSim"); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jRadioButtonBebeNao, org.jdesktop.beansbinding.ObjectProperty.create(), jRadioButtonSim, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jRadioButtonSim, gridBagConstraints);

        buttonGroupFumaSimNao.add(jRadioButtonFumaSim);
        jRadioButtonFumaSim.setText("SIM");
        jRadioButtonFumaSim.setName("jRadioButtonFumaSim"); // NOI18N
        jRadioButtonFumaSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFumaSimActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jRadioButtonFumaSim, gridBagConstraints);

        buttonGroupFumaSimNao.add(jRadioButtonFumaNao);
        jRadioButtonFumaNao.setText("NÃO");
        jRadioButtonFumaNao.setName("jRadioButtonFumaNao"); // NOI18N
        jRadioButtonFumaNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFumaNaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jRadioButtonFumaNao, gridBagConstraints);

        jLabelDiabete.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelDiabete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDiabete.setText("Diabete:");
        jLabelDiabete.setName("jLabelDiabete"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jLabelDiabete, gridBagConstraints);

        buttonGroupDiabete.add(jRadioButtonDiabetelBaixo);
        jRadioButtonDiabetelBaixo.setText("Baixo");
        jRadioButtonDiabetelBaixo.setName("jRadioButtonDiabetelBaixo"); // NOI18N
        jRadioButtonDiabetelBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDiabetelBaixoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jRadioButtonDiabetelBaixo, gridBagConstraints);

        buttonGroupDiabete.add(jRadioButtonDiabeteAceitavel);
        jRadioButtonDiabeteAceitavel.setText("Aceitável");
        jRadioButtonDiabeteAceitavel.setName("jRadioButtonDiabeteAceitavel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jRadioButtonDiabeteAceitavel, gridBagConstraints);

        buttonGroupDiabete.add(jRadioButtonDiabeteAlto);
        jRadioButtonDiabeteAlto.setText("Alto");
        jRadioButtonDiabeteAlto.setName("jRadioButtonDiabeteAlto"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jRadioButtonDiabeteAlto, gridBagConstraints);

        jLabelColesterol.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelColesterol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelColesterol.setText("Colesterol:");
        jLabelColesterol.setName("jLabelColesterol"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jLabelColesterol, gridBagConstraints);

        buttonGroupColesterol.add(jRadioButtonColesterolBaixo);
        jRadioButtonColesterolBaixo.setText("Baixo");
        jRadioButtonColesterolBaixo.setName("jRadioButtonColesterolBaixo"); // NOI18N
        jRadioButtonColesterolBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonColesterolBaixoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jRadioButtonColesterolBaixo, gridBagConstraints);

        buttonGroupColesterol.add(jRadioButtonColesterolAceitavel);
        jRadioButtonColesterolAceitavel.setText("Aceitável");
        jRadioButtonColesterolAceitavel.setName("jRadioButtonColesterolAceitavel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jRadioButtonColesterolAceitavel, gridBagConstraints);

        buttonGroupColesterol.add(jRadioButtonColesterolAlto);
        jRadioButtonColesterolAlto.setText("Alto");
        jRadioButtonColesterolAlto.setName("jRadioButtonColesterolAlto"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jRadioButtonColesterolAlto, gridBagConstraints);

        jLabelDoencaCardiaca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelDoencaCardiaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDoencaCardiaca.setText("Doença Cardiaca:");
        jLabelDoencaCardiaca.setName("jLabelData"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jLabelDoencaCardiaca, gridBagConstraints);

        jLabelCirurgia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCirurgia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCirurgia.setText("Cirurgias:");
        jLabelCirurgia.setName("jLabelData"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jLabelCirurgia, gridBagConstraints);

        jLabelAlergia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelAlergia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAlergia.setText("Alergias:");
        jLabelAlergia.setName("jLabelData"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jLabelAlergia, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Dados Adicionais Paciente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
        jPanelDadosAdcPaciente.add(jLabel1, gridBagConstraints);

        jScrollPaneCirurgias.setName("jScrollPaneCirurgias"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneCirurgias.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        jPanelDadosAdcPaciente.add(jScrollPaneCirurgias, gridBagConstraints);

        jScrollPaneAlergias.setName("jScrollPaneAlergias"); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneAlergias.setViewportView(jTable2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        jPanelDadosAdcPaciente.add(jScrollPaneAlergias, gridBagConstraints);

        buttonGroupDoencasCardiacas.add(jRadioButtonDoencaCardiacaSim);
        jRadioButtonDoencaCardiacaSim.setText("SIM");
        jRadioButtonDoencaCardiacaSim.setName("jRadioButtonDoencaCardiacaSim"); // NOI18N
        jRadioButtonDoencaCardiacaSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDoencaCardiacaSimActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jRadioButtonDoencaCardiacaSim, gridBagConstraints);

        buttonGroupDoencasCardiacas.add(jRadioButtonDoencaCardiacaNao);
        jRadioButtonDoencaCardiacaNao.setText("NÃO");
        jRadioButtonDoencaCardiacaNao.setName("jRadioButtonDoencaCardiacaNao"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jRadioButtonDoencaCardiacaNao, gridBagConstraints);

        jTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jTextField, gridBagConstraints);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jTextField3, gridBagConstraints);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jTextField2, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sintomas:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Diagnóstico:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pescrição do Tratamento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelDadosAdcPaciente.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        getContentPane().add(jPanelDadosAdcPaciente, gridBagConstraints);
        jPanelDadosAdcPaciente.getAccessibleContext().setAccessibleName("CadastroConsulta");

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar
        // TODO add your handling code here:
        this.setVisible(false);
        InterfaceOpcoesConsulta interfaceOpcoesConsulta = new InterfaceOpcoesConsulta();
        interfaceOpcoesConsulta.setVisible(true);
    }//GEN-LAST:event_cancelar

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jRadioButtonBebeNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBebeNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonBebeNaoActionPerformed

    private void jRadioButtonFumaNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFumaNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFumaNaoActionPerformed

    private void jRadioButtonDiabetelBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDiabetelBaixoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonDiabetelBaixoActionPerformed

    private void jRadioButtonFumaSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFumaSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFumaSimActionPerformed

    private void jRadioButtonColesterolBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonColesterolBaixoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonColesterolBaixoActionPerformed

    private void jRadioButtonDoencaCardiacaSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDoencaCardiacaSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonDoencaCardiacaSimActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceCadConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCadConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupBebeSimNao;
    private javax.swing.ButtonGroup buttonGroupColesterol;
    private javax.swing.ButtonGroup buttonGroupDiabete;
    private javax.swing.ButtonGroup buttonGroupDoencasCardiacas;
    private javax.swing.ButtonGroup buttonGroupFumaSimNao;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAlergia;
    private javax.swing.JLabel jLabelBebe;
    private javax.swing.JLabel jLabelCirurgia;
    private javax.swing.JLabel jLabelColesterol;
    private javax.swing.JLabel jLabelDiabete;
    private javax.swing.JLabel jLabelDoencaCardiaca;
    private javax.swing.JLabel jLabelFuma;
    private javax.swing.JPanel jPanelDadosAdcPaciente;
    private javax.swing.JRadioButton jRadioButtonBebeNao;
    private javax.swing.JRadioButton jRadioButtonColesterolAceitavel;
    private javax.swing.JRadioButton jRadioButtonColesterolAlto;
    private javax.swing.JRadioButton jRadioButtonColesterolBaixo;
    private javax.swing.JRadioButton jRadioButtonDiabeteAceitavel;
    private javax.swing.JRadioButton jRadioButtonDiabeteAlto;
    private javax.swing.JRadioButton jRadioButtonDiabetelBaixo;
    private javax.swing.JRadioButton jRadioButtonDoencaCardiacaNao;
    private javax.swing.JRadioButton jRadioButtonDoencaCardiacaSim;
    private javax.swing.JRadioButton jRadioButtonFumaNao;
    private javax.swing.JRadioButton jRadioButtonFumaSim;
    private javax.swing.JRadioButton jRadioButtonSim;
    private javax.swing.JScrollPane jScrollPaneAlergias;
    private javax.swing.JScrollPane jScrollPaneCirurgias;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}