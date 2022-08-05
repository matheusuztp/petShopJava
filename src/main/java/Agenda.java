import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/*
 * Matheus de Mello Bueno RA:2070286 - POO ENGENHARIA DE SOFTWARE
 */
public class Agenda extends javax.swing.JFrame 
{
    private final AgendaController controller;

    public Agenda() 
    {
        initComponents();
        controller = new AgendaController(this);
        iniciar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnAgendar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jTxtIdAgendamento = new javax.swing.JTextField();
        jTxtCodigoCliente = new javax.swing.JTextField();
        jTxtValorServico = new javax.swing.JTextField();
        jTipoAnimal = new javax.swing.JTextField();
        jTxtData = new javax.swing.JFormattedTextField();
        jTxtHora = new javax.swing.JFormattedTextField();
        jComboCliente = new javax.swing.JComboBox<>();
        jComboServico = new javax.swing.JComboBox<>();
        jComboAnimal = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAgendamento = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtObservacao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendamento");
        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(970, 618));
        setResizable(false);

        jBtnAgendar.setBackground(new java.awt.Color(204, 255, 204));
        jBtnAgendar.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jBtnAgendar.setText("AGENDAR");
        jBtnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgendarActionPerformed(evt);
            }
        });

        jBtnExcluir.setBackground(new java.awt.Color(225, 32, 35));
        jBtnExcluir.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jBtnExcluir.setText("EXCLUIR SELECIONADO");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jTxtIdAgendamento.setEditable(false);
        jTxtIdAgendamento.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N
        jTxtIdAgendamento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTxtIdAgendamento.setText("0");

        jTxtCodigoCliente.setEditable(false);
        jTxtCodigoCliente.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N
        jTxtCodigoCliente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTxtValorServico.setEditable(false);
        jTxtValorServico.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N
        jTxtValorServico.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTipoAnimal.setEditable(false);
        jTipoAnimal.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N
        jTipoAnimal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            jTxtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtData.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N

        try {
            jTxtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtHora.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N

        jComboCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboClienteItemStateChanged(evt);
            }
        });

        jComboServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboServicoItemStateChanged(evt);
            }
        });

        jComboAnimal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboAnimalItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel1.setText("Serviço");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel2.setText("Cliente");

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel4.setText("Código");

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel6.setText("Tipo");

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel7.setText("Observação");

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel8.setText("Hora");

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel9.setText("Data");

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel10.setText("Valor");

        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel11.setText("Animal");

        jTableAgendamento.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jTableAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Serviço", "Data", "Valor", "Animal", "Tipo", "Observação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAgendamento.setAlignmentX(0.7F);
        jTableAgendamento.setAlignmentY(0.9F);
        jTableAgendamento.setColumnSelectionAllowed(true);
        jTableAgendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableAgendamento.setRequestFocusEnabled(false);
        jTableAgendamento.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTableAgendamento.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTableAgendamento.setShowGrid(false);
        jTableAgendamento.getTableHeader().setResizingAllowed(false);
        jScrollPane2.setViewportView(jTableAgendamento);
        jTableAgendamento.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jTxtObservacao.setColumns(20);
        jTxtObservacao.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTxtObservacao.setLineWrap(true);
        jTxtObservacao.setRows(5);
        jTxtObservacao.setTabSize(1);
        jTxtObservacao.setToolTipText("");
        jTxtObservacao.setWrapStyleWord(true);
        jTxtObservacao.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTxtObservacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtIdAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(250, 250, 250)
                                .addComponent(jComboServico, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(152, 152, 152)
                                .addComponent(jLabel8)
                                .addGap(162, 162, 162)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jTxtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(jTxtValorServico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(328, 328, 328)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtIdAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboServico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtValorServico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnAgendar)
                    .addComponent(jBtnExcluir))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(979, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboClienteItemStateChanged
        BDCliente BDCliente = new BDCliente();
        BDAnimal BDAnimal = new BDAnimal();
        ArrayList<Cliente> clienteID = BDCliente.selectAll();
        ArrayList<Animal> animais = BDAnimal.selectAll();
        
        Cliente nomeAtual = (Cliente) jComboCliente.getSelectedItem();
        
        DefaultComboBoxModel cbAnimal = (DefaultComboBoxModel) getjComboAnimal().getModel();
        
        jComboAnimal.removeAllItems();
        for (int i = 0; i < clienteID.size(); i++)
        {
            if(nomeAtual.getNome().equalsIgnoreCase(clienteID.get(i).getNome()))
            {
                int id = clienteID.get(i).getId();
                jTxtCodigoCliente.setText(""+id);
            }
        }
        
        for (Animal animal : animais) 
        {
            if(animal.getCliente().getNome().equalsIgnoreCase(nomeAtual.getNome()))
            {
                cbAnimal.addElement(animal);
                
            }
        }
                jComboAnimalItemStateChanged(evt);
    }//GEN-LAST:event_jComboClienteItemStateChanged

    private void jComboServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboServicoItemStateChanged
        BDServico BDServico = new BDServico();
        ArrayList<Servico> valorServico = BDServico.selectAll();
        
        Servico servicoAtual = (Servico) jComboServico.getSelectedItem();
        
        for (int i = 0; i < valorServico.size(); i++) {
            if(servicoAtual.getDescricao().equalsIgnoreCase(valorServico.get(i).getDescricao()))
            {
                float valor = valorServico.get(i).getValor();
                jTxtValorServico.setText("R$ "+valor);
            }
        }
    }//GEN-LAST:event_jComboServicoItemStateChanged

    private void jBtnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgendarActionPerformed
        this.controller.agendar();
    }//GEN-LAST:event_jBtnAgendarActionPerformed

    private void jComboAnimalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboAnimalItemStateChanged
        BDAnimal BDAnimal = new BDAnimal();
        ArrayList<Animal> animais = BDAnimal.selectAll();
        
        Animal animalAtual = (Animal) jComboAnimal.getSelectedItem();
        
        if(animalAtual != null)
        {
            for(Animal animal : animais)
            {
                if(animal.getNome().equalsIgnoreCase(animalAtual.getNome()))
                    jTipoAnimal.setText(animal.getTipo());
            }
        }
        
    }//GEN-LAST:event_jComboAnimalItemStateChanged

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        
        if(jTableAgendamento.getSelectedRowCount() > 0)
        {
            int resposta = JOptionPane.showConfirmDialog(this,"Deseja excluir o agendamento?", "Atenção!",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            
            if(resposta == JOptionPane.YES_OPTION)
                this.controller.excluir(jTableAgendamento.getSelectedRow());
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Selecione um Agendamento.", "Atenção", HEIGHT);
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgendar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JComboBox<String> jComboAnimal;
    private javax.swing.JComboBox<String> jComboCliente;
    private javax.swing.JComboBox<String> jComboServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAgendamento;
    private javax.swing.JTextField jTipoAnimal;
    private javax.swing.JTextField jTxtCodigoCliente;
    private javax.swing.JFormattedTextField jTxtData;
    private javax.swing.JFormattedTextField jTxtHora;
    private javax.swing.JTextField jTxtIdAgendamento;
    private javax.swing.JTextArea jTxtObservacao;
    private javax.swing.JTextField jTxtValorServico;
    // End of variables declaration//GEN-END:variables

    private void iniciar() 
    {
        this.controller.atualizaTabela();
        this.controller.atualizaServido();
        this.controller.atualizaCliente();
    }
    
    public JComboBox<String> getjComboAnimal() {
        return jComboAnimal;
    }

    public void setjComboAnimal(JComboBox<String> jComboAnimal) {
        this.jComboAnimal = jComboAnimal;
    }

    public JComboBox<String> getjComboCliente() {
        return jComboCliente;
    }

    public void setjComboCliente(JComboBox<String> jComboCliente) {
        this.jComboCliente = jComboCliente;
    }

    public JComboBox<String> getjComboServico() {
        return jComboServico;
    }

    public void setjComboServico(JComboBox<String> jComboServico) {
        this.jComboServico = jComboServico;
    }
    
    
    public JTable getjTableAgendamento() 
    {
        return jTableAgendamento;
    }

    public void setjTableAgendamento(JTable jTableAgendamento) 
    {
        this.jTableAgendamento = jTableAgendamento;
    }

    public JTextField getjTxtCodigoCliente() {
        return jTxtCodigoCliente;
    }

    public void setjTxtCodigoCliente(JTextField jTxtCodigoCliente) {
        this.jTxtCodigoCliente = jTxtCodigoCliente;
    }

    public JTextField getjTxtIdAgendamento() {
        return jTxtIdAgendamento;
    }

    public void setjTxtIdAgendamento(JTextField jTxtIdAgendamento) {
        this.jTxtIdAgendamento = jTxtIdAgendamento;
    }

    public JFormattedTextField getjTxtData() {
        return jTxtData;
    }

    public void setjTxtData(JFormattedTextField jTxtData) {
        this.jTxtData = jTxtData;
    }

    public JFormattedTextField getjTxtHora() {
        return jTxtHora;
    }

    public void setjTxtHora(JFormattedTextField jTxtHora) {
        this.jTxtHora = jTxtHora;
    }

    public JTextArea getjTxtObservacao() {
        return jTxtObservacao;
    }

    public void setjTxtObservacao(JTextArea jTxtObservacao) {
        this.jTxtObservacao = jTxtObservacao;
    }
}
