/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Produto;
import Model.ProdutoDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jmsim
 */
public class Vender_Produto extends javax.swing.JFrame {

    /**
     * Creates new form Vender_Produto
     */
    Produto p = new Produto();
    public Vender_Produto(int linhaSelecionada) {
        p = ProdutoDAO.buscaId( linhaSelecionada);
        
        initComponents();
       
    }

    private Vender_Produto() {
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
        nome_txt = new javax.swing.JTextField();
        valor_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        aviso5 = new javax.swing.JLabel();
        salvar_btn = new javax.swing.JButton();
        aviso4 = new javax.swing.JLabel();
        aviso6 = new javax.swing.JLabel();
        voltar_btn = new javax.swing.JButton();
        vendido_rbx = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        nome_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nome_txt.setText(p.getNome());

        valor_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valor_txt.setText(p.getValor());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("E-lance");

        jLabel2.setText("Alterar caracteristicas");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Valor:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Produto:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Status:");

        aviso5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aviso5.setForeground(new java.awt.Color(255, 0, 51));
        aviso5.setText("Valor invalido! ");
        aviso5.setToolTipText("O valor que você informou não pode conter \",\" ou \".\" ou qualquer tipo de simbolo\napenas valores inteiros são aceitos");

        salvar_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salvar_btn.setText("Salvar");
        salvar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_btnActionPerformed(evt);
            }
        });

        aviso4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aviso4.setForeground(new java.awt.Color(255, 0, 51));
        aviso4.setText("Nome Invalido!");
        aviso4.setToolTipText("Nome invalido? provavelmente você digitou algum simbolo não aceito");

        aviso6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aviso6.setForeground(new java.awt.Color(255, 0, 51));
        aviso6.setText("Selecione algo!");
        aviso6.setToolTipText("Por favor selecione alguma opção para atualizar o produto na lista ");

        voltar_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        voltar_btn.setText("Voltar");
        voltar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_btnActionPerformed(evt);
            }
        });

        buttonGroup1.add(vendido_rbx);
        vendido_rbx.setText("Vender");
        vendido_rbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendido_rbxActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Não Vender");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aviso6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(vendido_rbx)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton1))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(salvar_btn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGap(44, 44, 44))
                                .addComponent(voltar_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(valor_txt)
                        .addComponent(nome_txt)
                        .addComponent(aviso4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aviso5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(58, 58, 58)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aviso4)
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aviso5)
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendido_rbx)
                    .addComponent(jRadioButton1))
                .addGap(11, 11, 11)
                .addComponent(aviso6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar_btn)
                    .addComponent(voltar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void voltar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_btnActionPerformed
        
        Lista_Produtos lista_produtos = new Lista_Produtos();
        lista_produtos.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltar_btnActionPerformed

    public void desabilitaravisos(){
        aviso4.setVisible(false);
        aviso5.setVisible(false);
        aviso6.setVisible(false);
    }
    private void salvar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_btnActionPerformed
        
        p.setNome(nome_txt.getText());
        p.setValor(valor_txt.getText());
        if(vendido_rbx.isSelected()){
            p.setStatus("Vendido");
        }
        else{
            p.setStatus("A venda");
        }
        if(p.getNome().matches("[a-zA-Z- [1-9][0-9]\\p{L}]+") && p.getValor().matches("[1-9][0-9]*" )){
               if(ProdutoDAO.Editar(p)){   
                   desabilitaravisos();
                   JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
               }
        }
          else {
           if(!p.getNome().matches("[a-zA-Z- [1-9][0-9]\\p{L}]+")){
           aviso4.setVisible(true);
           }
           else {
               aviso4.setVisible(false);
           }
           if(!p.getValor().matches("[1-9][0-9]*" )){
           aviso5.setVisible(true);
           }
           else{
               aviso5.setVisible(false);
           }
           if(!vendido_rbx.isSelected()){
               aviso6.setVisible(true);
           }
           else{
               aviso6.setVisible(false);
           }
           }
        
    }//GEN-LAST:event_salvar_btnActionPerformed
    
    private void vendido_rbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendido_rbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendido_rbxActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Vender_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vender_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vender_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vender_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vender_Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso4;
    private javax.swing.JLabel aviso5;
    private javax.swing.JLabel aviso6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField nome_txt;
    private javax.swing.JButton salvar_btn;
    private javax.swing.JTextField valor_txt;
    private javax.swing.JRadioButton vendido_rbx;
    private javax.swing.JButton voltar_btn;
    // End of variables declaration//GEN-END:variables
}