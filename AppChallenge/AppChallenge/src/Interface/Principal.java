/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

/**
 *
 * @author guilherme.vcmoz
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btGerenciar = new javax.swing.JButton();
        btEstoque = new javax.swing.JButton();
        btAjuda = new javax.swing.JButton();
        btQuemSomos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btFeedback = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        btMenu = new javax.swing.JMenuItem();
        jEstoque = new javax.swing.JMenu();
        btEstoque2 = new javax.swing.JMenuItem();
        jFornecedores = new javax.swing.JMenu();
        btFornecedores2 = new javax.swing.JMenuItem();
        jAjuda = new javax.swing.JMenu();
        btAjuda2 = new javax.swing.JMenuItem();
        jFeedback = new javax.swing.JMenu();
        btFeedback2 = new javax.swing.JMenuItem();
        jQuemSomos = new javax.swing.JMenu();
        btQuemsomos3 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sistema de Estoque");

        btGerenciar.setBackground(new java.awt.Color(0, 0, 0));
        btGerenciar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btGerenciar.setForeground(new java.awt.Color(255, 255, 255));
        btGerenciar.setText("Fornecedores");
        btGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerenciarActionPerformed(evt);
            }
        });

        btEstoque.setBackground(new java.awt.Color(0, 0, 0));
        btEstoque.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btEstoque.setForeground(new java.awt.Color(255, 255, 255));
        btEstoque.setText("Estoque");
        btEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstoqueActionPerformed(evt);
            }
        });

        btAjuda.setBackground(new java.awt.Color(0, 0, 0));
        btAjuda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAjuda.setForeground(new java.awt.Color(255, 255, 255));
        btAjuda.setText("Ajuda");
        btAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAjudaActionPerformed(evt);
            }
        });

        btQuemSomos.setBackground(new java.awt.Color(0, 0, 0));
        btQuemSomos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btQuemSomos.setForeground(new java.awt.Color(255, 255, 255));
        btQuemSomos.setText("Quem somos");
        btQuemSomos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuemSomosActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGTRAB.PNG"))); // NOI18N

        btFeedback.setBackground(new java.awt.Color(0, 0, 0));
        btFeedback.setForeground(new java.awt.Color(255, 255, 255));
        btFeedback.setText("Feedback");
        btFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFeedbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btGerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btQuemSomos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(319, 319, 319))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(389, 389, 389))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGerenciar)
                    .addComponent(btEstoque)
                    .addComponent(btAjuda)
                    .addComponent(btQuemSomos)
                    .addComponent(btFeedback))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu.setBackground(new java.awt.Color(0, 0, 0));
        jMenu.setForeground(new java.awt.Color(255, 255, 255));
        jMenu.setText("Menu");

        btMenu.setText("Menu");
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });
        jMenu.add(btMenu);

        jMenuBar1.add(jMenu);

        jEstoque.setForeground(new java.awt.Color(255, 255, 255));
        jEstoque.setText("Estoque");

        btEstoque2.setText("Estoque");
        btEstoque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstoque2ActionPerformed(evt);
            }
        });
        jEstoque.add(btEstoque2);

        jMenuBar1.add(jEstoque);

        jFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        jFornecedores.setText("Fornecedores");

        btFornecedores2.setText("Fornecedores");
        btFornecedores2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFornecedores2ActionPerformed(evt);
            }
        });
        jFornecedores.add(btFornecedores2);

        jMenuBar1.add(jFornecedores);

        jAjuda.setForeground(new java.awt.Color(255, 255, 255));
        jAjuda.setText("Ajuda");

        btAjuda2.setText("Ajuda");
        btAjuda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAjuda2ActionPerformed(evt);
            }
        });
        jAjuda.add(btAjuda2);

        jMenuBar1.add(jAjuda);

        jFeedback.setForeground(new java.awt.Color(255, 255, 255));
        jFeedback.setText("Feedback");

        btFeedback2.setText("Feedback");
        btFeedback2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFeedback2ActionPerformed(evt);
            }
        });
        jFeedback.add(btFeedback2);

        jMenuBar1.add(jFeedback);

        jQuemSomos.setForeground(new java.awt.Color(255, 255, 255));
        jQuemSomos.setText("Quem Somos");

        btQuemsomos3.setText("Quem somos");
        btQuemsomos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuemsomos3ActionPerformed(evt);
            }
        });
        jQuemSomos.add(btQuemsomos3);

        jMenuBar1.add(jQuemSomos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerenciarActionPerformed
        // TODO add your handling code here:
        Fornecedores uf = new Fornecedores();
        uf.setVisible(true);
    }//GEN-LAST:event_btGerenciarActionPerformed

    private void btEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstoqueActionPerformed
        // TODO add your handling code here:
        TelaEstoque uf = new TelaEstoque();
        uf.setVisible(true);
    }//GEN-LAST:event_btEstoqueActionPerformed

    private void btEstoque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstoque2ActionPerformed
        // TODO add your handling code here:
        TelaEstoque uf = new TelaEstoque();
        uf.setVisible(true);
    }//GEN-LAST:event_btEstoque2ActionPerformed

    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
        // TODO add your handling code here:
        Principal uf = new Principal();
        uf.setVisible(true);
    }//GEN-LAST:event_btMenuActionPerformed

    private void btFornecedores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFornecedores2ActionPerformed
        // TODO add your handling code here:
        Fornecedores uf = new Fornecedores();
        uf.setVisible(true);
    }//GEN-LAST:event_btFornecedores2ActionPerformed

    private void btAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAjudaActionPerformed
        // TODO add your handling code here:
        Ajuda uf = new Ajuda();
        uf.setVisible(true);
    }//GEN-LAST:event_btAjudaActionPerformed

    private void btQuemSomosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuemSomosActionPerformed
        // TODO add your handling code here:
        QuemSomos uf = new QuemSomos();
        uf.setVisible(true);
    }//GEN-LAST:event_btQuemSomosActionPerformed

    private void btAjuda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAjuda2ActionPerformed
        // TODO add your handling code here:
        Ajuda uf = new Ajuda();
        uf.setVisible(true);
    }//GEN-LAST:event_btAjuda2ActionPerformed

    private void btQuemsomos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuemsomos3ActionPerformed
        // TODO add your handling code here:
        QuemSomos uf = new QuemSomos();
        uf.setVisible(true);        
    }//GEN-LAST:event_btQuemsomos3ActionPerformed

    private void btFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFeedbackActionPerformed
        // TODO add your handling code here:
        Feedback uf = new Feedback();
        uf.setVisible(true);
    }//GEN-LAST:event_btFeedbackActionPerformed

    private void btFeedback2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFeedback2ActionPerformed
        // TODO add your handling code here:
        Feedback uf = new Feedback();
        uf.setVisible(true);
    }//GEN-LAST:event_btFeedback2ActionPerformed
   
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAjuda;
    private javax.swing.JMenuItem btAjuda2;
    private javax.swing.JButton btEstoque;
    private javax.swing.JMenuItem btEstoque2;
    private javax.swing.JButton btFeedback;
    private javax.swing.JMenuItem btFeedback2;
    private javax.swing.JMenuItem btFornecedores2;
    private javax.swing.JButton btGerenciar;
    private javax.swing.JMenuItem btMenu;
    private javax.swing.JButton btQuemSomos;
    private javax.swing.JMenuItem btQuemsomos3;
    private javax.swing.JMenu jAjuda;
    private javax.swing.JMenu jEstoque;
    private javax.swing.JMenu jFeedback;
    private javax.swing.JMenu jFornecedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jQuemSomos;
    // End of variables declaration//GEN-END:variables
}
