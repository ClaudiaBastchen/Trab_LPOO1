/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interface;

import Model_pizzariaclaudiaerica.Cliente;
import Model_pizzariaclaudiaerica.TabelaCliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Clau
 */
public class jifCadastro extends javax.swing.JInternalFrame {
    private final TabelaCliente modelo = new TabelaCliente();
    private final List<Cliente> listaDeClientes = new ArrayList();
    private int linhaClicada=-1;
    
    /**
     * Creates new form jifCadastro
     */
    public jifCadastro() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLnome = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jTsobrenome = new javax.swing.JTextField();
        jLsobrenome = new javax.swing.JLabel();
        jLtelefone = new javax.swing.JLabel();
        jFTtelefone = new javax.swing.JFormattedTextField();
        jLemail = new javax.swing.JLabel();
        jTemail = new javax.swing.JTextField();
        bsalvar = new javax.swing.JButton();
        blimpar = new javax.swing.JButton();
        bsair = new javax.swing.JButton();
        Scroll = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bexcluir = new javax.swing.JButton();
        jalterar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Clientes");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLnome.setText("Nome:");

        jLsobrenome.setText("Sobrenome:");

        jLtelefone.setText("Telefone:");

        try {
            jFTtelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55 (##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLemail.setText("E-mail:");

        bsalvar.setBackground(new java.awt.Color(153, 204, 255));
        bsalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bsalvar.setText("Salvar");
        bsalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bsalvarMouseClicked(evt);
            }
        });

        blimpar.setBackground(new java.awt.Color(204, 255, 204));
        blimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        blimpar.setText("Limpar Lista");
        blimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blimparMouseClicked(evt);
            }
        });

        bsair.setBackground(new java.awt.Color(255, 255, 204));
        bsair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bsair.setText("Sair");
        bsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsairActionPerformed(evt);
            }
        });

        jTable1.setModel(modelo);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        Scroll.setViewportView(jTable1);

        bexcluir.setBackground(new java.awt.Color(255, 204, 204));
        bexcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bexcluir.setText("Excluir");
        bexcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bexcluirMouseClicked(evt);
            }
        });

        jalterar.setText("Alterar");
        jalterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jalterarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Scroll)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLnome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFTtelefone)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLsobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLemail, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(blimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTemail)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTsobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(bexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bsair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnome)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLsobrenome)
                    .addComponent(jTsobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLtelefone)
                    .addComponent(jFTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLemail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsalvar)
                    .addComponent(blimpar)
                    .addComponent(bsair)
                    .addComponent(bexcluir)
                    .addComponent(jalterar))
                .addGap(18, 18, 18)
                .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(200, 20, 732, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //quando essa tela de cadastro abrir a variavel vai se tornar verdadeira e não falsa 
        jfprincipal.cadastro = true;
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void bsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsairActionPerformed
        
        jfprincipal.cadastro = false; // variavel deve se tornar falsa para que quando fechar a tela poder abrer novamente
        dispose(); //usar toda vez que for sair
        // TODO add your handling code here:
    }//GEN-LAST:event_bsairActionPerformed

    private void bsalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsalvarMouseClicked

                
        String nome = jTnome.getText();
        String sobrenome = jTsobrenome.getText();
        String telefone = jFTtelefone.getText();
        String email = jTemail.getText();
        //Cliente c = null;
        
        Cliente cliente = new Cliente(-1L,nome,sobrenome,telefone, email);
        listaDeClientes.add(cliente);
        modelo.adicionaCliente(cliente);
        
        
        //DefaultTableModel val = (DefaultTableModel) jTable1.getModel();
            //val.addRow(new String[]{-1L, nome, sobrenome, telefone, email});
        
            
            
            jTnome.setText("");
            jTsobrenome.setText("");
            jFTtelefone.setText("");
            jTemail.setText("");
            
            jTnome.requestFocus(); //limpa os campos e retorna na caixa de texto do nome
        
        // TODO add your handling code here:
    }//GEN-LAST:event_bsalvarMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        //Pega a linha clicada
        linhaClicada = jTable1.rowAtPoint(evt.getPoint());
        //Pega o contato da linha clidada
        Cliente contato = modelo.getCliente(linhaClicada);
        //Seta os dados nos componentes
        
        jTnome.setText(contato.getNome());
        jTsobrenome.setText(contato.getSobrenome());
        jFTtelefone.setText(contato.getTelefone());
        jTemail.setText(contato.getEmail());
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void bexcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bexcluirMouseClicked

        int[] linhasSelecionadas = jTable1.getSelectedRows();
        List<Cliente> listaExcluir = new ArrayList();
        for (int i = 0; i < linhasSelecionadas.length; i++) {
            Cliente cliente = modelo.getCliente(linhasSelecionadas[i]);
            listaExcluir.add(cliente);

        }
        for(Cliente cliente:listaExcluir){
            listaDeClientes.remove(cliente);
            modelo.removeCliente(cliente);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bexcluirMouseClicked

    private void jalterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jalterarMouseClicked

            if(linhaClicada!=-1){
            Cliente cliente = modelo.getCliente(linhaClicada);

            String nome = jTnome.getText();
            String sobrenome = jTsobrenome.getText();
            String telefone = jFTtelefone.getText();
            cliente.setNome(jTnome.getText());
            cliente.setSobrenome(jTsobrenome.getText());
            cliente.setTelefone(jFTtelefone.getText());
            cliente.setEmail(jTemail.getText());
            //Atualiza tabela
            modelo.fireTableRowsUpdated(linhaClicada, linhaClicada);
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jalterarMouseClicked

    private void blimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blimparMouseClicked

        modelo.limpaTabela();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_blimparMouseClicked

public static void main(String args[]) {

        /* Cliente */
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(jifCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

        /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
            new jifCadastro().setVisible(true);
        }
    });
}
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JButton bexcluir;
    private javax.swing.JButton blimpar;
    private javax.swing.JButton bsair;
    private javax.swing.JButton bsalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField jFTtelefone;
    private javax.swing.JLabel jLemail;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLsobrenome;
    private javax.swing.JLabel jLtelefone;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTsobrenome;
    private javax.swing.JButton jalterar;
    // End of variables declaration//GEN-END:variables
}