/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

<<<<<<< HEAD
import controller.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.*;
=======
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9
/**
 *
 * @author Leonardo
 */
<<<<<<< HEAD
public class viewIngrediente extends javax.swing.JFrame {
=======
public class viewCardapio extends javax.swing.JFrame {
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9

    /**
     * Creates new form teste
     */
<<<<<<< HEAD
    public viewIngrediente() {
        initComponents();
        setLocationRelativeTo(null);
        this.atualizaTabela();
=======
    public viewCardapio() {
        initComponents();
        setLocationRelativeTo(null);
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
        jPanel1 = new javax.swing.JPanel();
=======
        Fornecedor = new javax.swing.JPanel();
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9
        textID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
<<<<<<< HEAD
        textUnidade = new javax.swing.JTextField();
=======
        textDetalhes = new javax.swing.JTextField();
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9
        jLabel3 = new javax.swing.JLabel();
        checkAtivo = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        buttonLimpar = new javax.swing.JButton();
        buttonBusca = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonNovo = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        textBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
<<<<<<< HEAD
        tabela = new javax.swing.JTable();
        buttonNovo1 = new javax.swing.JButton();
        comboFornecedor = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
=======
        jTable1 = new javax.swing.JTable();
        labelFornecedor = new javax.swing.JLabel();
        boxFornecedor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fornecedor.setBackground(new java.awt.Color(51, 204, 255));
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9

        jLabel1.setText("Id");

        jLabel2.setText("Nome");

        jLabel3.setText("Unidade");

        checkAtivo.setText("Ativo");

        jLabel4.setText("Status");

        buttonLimpar.setText("Limpar");
<<<<<<< HEAD
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        buttonBusca.setText("Pesquisar");
        buttonBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscaActionPerformed(evt);
            }
        });

        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonNovo.setText("Novo");
        buttonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoActionPerformed(evt);
            }
        });

        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
=======

        buttonBusca.setText("Pesquisar");

        buttonEditar.setText("Editar");

        buttonNovo.setText("Novo");

        buttonExcluir.setText("Excluir");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9
            new Object [][] {

            },
            new String [] {
<<<<<<< HEAD
                "idi", "nome", "detalhes", "status"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        buttonNovo1.setText("Visualizar");
        buttonNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovo1ActionPerformed(evt);
            }
        });

        comboFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Fornecedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(comboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textBusca))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(buttonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
=======
                "id", "nome", "detalhes", "status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        labelFornecedor.setText("Fornecedor");

        javax.swing.GroupLayout FornecedorLayout = new javax.swing.GroupLayout(Fornecedor);
        Fornecedor.setLayout(FornecedorLayout);
        FornecedorLayout.setHorizontalGroup(
            FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(FornecedorLayout.createSequentialGroup()
                        .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FornecedorLayout.createSequentialGroup()
                        .addGroup(FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FornecedorLayout.createSequentialGroup()
                                .addGroup(FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelFornecedor)
                                    .addComponent(boxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(checkAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(FornecedorLayout.createSequentialGroup()
                                .addComponent(buttonBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 114, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FornecedorLayout.setVerticalGroup(
            FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FornecedorLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
<<<<<<< HEAD
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
=======
                    .addComponent(labelFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxFornecedor))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(buttonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addContainerGap())
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
            .addComponent(Fornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        ingredienteController pc = new ingredienteController();
        ingrediente p = new ingrediente();
        
        if(String.valueOf(textID.getText()).isEmpty()){
            JOptionPane.showMessageDialog(null, "ID não pode ser vazio");
            return;
        }
        p.setId(Integer.parseInt(textID.getText()));
        pc.excluir(p);
        this.limparTela();
        this.atualizaTabela();
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
      this.limparTela();
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void buttonBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscaActionPerformed
         ingredienteController pc = new ingredienteController();
            ingrediente p = new ingrediente();
            p.setNome(textBusca.getText());
            p.setUnidade(textBusca.getText());
            this.atualizarBusca(p);
    }//GEN-LAST:event_buttonBuscaActionPerformed

    private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
        ingrediente p = new ingrediente();
      
        if(textNome.equals("") || textUnidade.equals("")){
            JOptionPane.showMessageDialog(null, "Verifique os dados Informados");
        }else{
            ingredienteController pc = new ingredienteController();
            p.setNome(textNome.getText());
            p.setUnidade(textUnidade.getText());
            
            p.setStatus(true);
            pc.cadastrar(p);
        }
        this.atualizaTabela();
        this.limparTela();
    }//GEN-LAST:event_buttonNovoActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
       tabela.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent arg0) {
                    int linha = tabela.getSelectedRow();
                    textID.setText(tabela.getValueAt(linha, 0).toString());
                    textNome.setText(tabela.getValueAt(linha, 1).toString());
                    textUnidade.setText(tabela.getValueAt(linha, 2).toString());
            }
        }); 
    }//GEN-LAST:event_tabelaMouseClicked

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
            ingrediente p = new ingrediente();

            if(String.valueOf(textID.getText()).isEmpty()){
                JOptionPane.showMessageDialog(null, "Verifique os dados Informados");
                return;
            }else{
                ingredienteController pc = new ingredienteController();
                p.setId(Integer.parseInt(textID.getText()));
                p.setNome(textNome.getText());
                p.setUnidade(textUnidade.getText());
                
                if(checkAtivo.isSelected()){
                    p.setStatus(true);
                }
                pc.alterar(p);
            }             
            
            this.atualizaTabela();
            this.limparTela();
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovo1ActionPerformed
        // FAZER LOGICA DE VISUALIZAÇÃO
//        new ingredientesFinalizados().setVisible(true);
    }//GEN-LAST:event_buttonNovo1ActionPerformed

=======
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9
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
<<<<<<< HEAD
            java.util.logging.Logger.getLogger(viewIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
=======
            java.util.logging.Logger.getLogger(viewCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
<<<<<<< HEAD
                new viewIngrediente().setVisible(true);
=======
                new viewCardapio().setVisible(true);
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9
            }
        });
    }
    
<<<<<<< HEAD
    
    public void atualizaTabela(){
        tabela.setModel(new ingredienteTableModel(new ingredienteController().listarTodos()));
    }
    public void atualizarBusca(ingrediente p){
        tabela.setModel(new ingredienteTableModel(new ingredienteController().buscar(p)));
    }
    public void atualizarBusca(){
//        tabela.setModel(new ingredienteTableModel(new ingredienteController().buscar(p)));
//        comboFornecedor.setModel(new DefaultComboBoxModel(new fornecedorController().));
    }
     
     public void limparTela(){
        textID.setText("");
        textNome.setText("");
        textUnidade.setText("");
        textBusca.setText("");
        checkAtivo.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
=======
    DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(strList.toArray());
 comboBox.setModel(defaultComboBoxModel);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fornecedor;
    private javax.swing.JComboBox<String> boxFornecedor;
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9
    private javax.swing.JButton buttonBusca;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonNovo;
<<<<<<< HEAD
    private javax.swing.JButton buttonNovo1;
    private javax.swing.JCheckBox checkAtivo;
    private javax.swing.JComboBox<String> comboFornecedor;
=======
    private javax.swing.JCheckBox checkAtivo;
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField textBusca;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textUnidade;
=======
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelFornecedor;
    private javax.swing.JTextField textBusca;
    private javax.swing.JTextField textDetalhes;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textNome;
>>>>>>> a4bfc0db77a2f0beef8fc011c50affddaab4e5b9
    // End of variables declaration//GEN-END:variables
}
