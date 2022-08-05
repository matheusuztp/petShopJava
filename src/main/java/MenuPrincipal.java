/*
 * Matheus de Mello Bueno RA.: 2070286 - POO Engenharia de Software
 */

public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;

    public MenuPrincipal() {
        initComponents();
        this.controller = new MenuPrincipalController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBarra = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jUsuario = new javax.swing.JMenuItem();
        jCadastro = new javax.swing.JMenuItem();
        jServico = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuOperação = new javax.swing.JMenu();
        jAgendamento = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jRelatorioClientes = new javax.swing.JMenuItem();
        jRelatorioServicos = new javax.swing.JMenuItem();
        jRelatorioAnimais = new javax.swing.JMenuItem();
        jRelatorioUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setResizable(false);

        jMenuCadastro.setText("Cadastro");

        jUsuario.setText("Usuario");
        jUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jUsuario);

        jCadastro.setText("Cliente");
        jCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jCadastro);

        jServico.setText("Serviço");
        jServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jServicoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jServico);

        jMenuItem1.setText("Animal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem1);

        jMenuBarra.add(jMenuCadastro);

        jMenuOperação.setText("Operação");

        jAgendamento.setText("Agendamento");
        jAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgendamentoActionPerformed(evt);
            }
        });
        jMenuOperação.add(jAgendamento);

        jMenuBarra.add(jMenuOperação);

        jMenuRelatorios.setText("Relatórios");

        jRelatorioClientes.setText("Clientes");
        jRelatorioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRelatorioClientesActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jRelatorioClientes);

        jRelatorioServicos.setText("Serviços");
        jRelatorioServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRelatorioServicosActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jRelatorioServicos);

        jRelatorioAnimais.setText("Animais");
        jRelatorioAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRelatorioAnimaisActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jRelatorioAnimais);

        jRelatorioUsuarios.setText("Usuarios");
        jRelatorioUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRelatorioUsuariosActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jRelatorioUsuarios);

        jMenuBarra.add(jMenuRelatorios);

        setJMenuBar(jMenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1186, 680));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgendamentoActionPerformed
        this.controller.abreAgendamento();
    }//GEN-LAST:event_jAgendamentoActionPerformed

    private void jCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroActionPerformed
        this.controller.abreCadastroCliente();
    }//GEN-LAST:event_jCadastroActionPerformed

    private void jServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jServicoActionPerformed
        this.controller.abreCadastroServico();
    }//GEN-LAST:event_jServicoActionPerformed

    private void jUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioActionPerformed
        this.controller.abreCadastroUsuario();
    }//GEN-LAST:event_jUsuarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.controller.abreCadastroAnimal();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jRelatorioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRelatorioClientesActionPerformed
        this.controller.abreRelatorioClientes();
    }//GEN-LAST:event_jRelatorioClientesActionPerformed

    private void jRelatorioServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRelatorioServicosActionPerformed
        this.controller.abreRelatorioServicos();
    }//GEN-LAST:event_jRelatorioServicosActionPerformed

    private void jRelatorioAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRelatorioAnimaisActionPerformed
        this.controller.abreRelatorioAnimais();
    }//GEN-LAST:event_jRelatorioAnimaisActionPerformed

    private void jRelatorioUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRelatorioUsuariosActionPerformed
        this.controller.abreRelatorioUsuarios();
    }//GEN-LAST:event_jRelatorioUsuariosActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAgendamento;
    private javax.swing.JMenuItem jCadastro;
    private javax.swing.JMenuBar jMenuBarra;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuOperação;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenuItem jRelatorioAnimais;
    private javax.swing.JMenuItem jRelatorioClientes;
    private javax.swing.JMenuItem jRelatorioServicos;
    private javax.swing.JMenuItem jRelatorioUsuarios;
    private javax.swing.JMenuItem jServico;
    private javax.swing.JMenuItem jUsuario;
    // End of variables declaration//GEN-END:variables
}
