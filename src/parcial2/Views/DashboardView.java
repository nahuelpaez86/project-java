package parcial2.Views;

import javax.swing.JFrame;

public class DashboardView extends javax.swing.JFrame {
    public DashboardView() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        checkbox1 = new javax.swing.JButton();
        booksButton = new javax.swing.JButton();
        checkbox2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userButton.setFont(new java.awt.Font("SF Compact Text", 2, 18)); // NOI18N
        userButton.setText("Usuarios");
        userButton.setBounds(new java.awt.Rectangle(2, 0, 2, 0));
        userButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersButtonAction(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SF Compact", 2, 18)); // NOI18N
        jLabel1.setText("Bienvenidos al panel de control de Book App");

        checkbox1.setFont(new java.awt.Font("SF Compact Text", 2, 18)); // NOI18N
        checkbox1.setText("Checkbox1");
        checkbox1.setBounds(new java.awt.Rectangle(2, 0, 2, 0));
        checkbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox1ActionPerformed(evt);
            }
        });

        booksButton.setFont(new java.awt.Font("SF Compact Text", 2, 18)); // NOI18N
        booksButton.setText("Libros");
        booksButton.setBounds(new java.awt.Rectangle(2, 0, 2, 0));
        booksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksButtonAction(evt);
            }
        });

        checkbox2.setFont(new java.awt.Font("SF Compact Text", 2, 18)); // NOI18N
        checkbox2.setText("Checkbox2");
        checkbox2.setBounds(new java.awt.Rectangle(2, 0, 2, 0));
        checkbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(booksButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkbox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         
    }//GEN-LAST:event_jLabel2MouseClicked

    private void usersButtonAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersButtonAction
        JFrame usersView = new UsersView();
        this.navigateTo(usersView);
    }//GEN-LAST:event_usersButtonAction

    private void checkbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox1ActionPerformed

    private void booksButtonAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksButtonAction
        // TODO add your handling code here:
    }//GEN-LAST:event_booksButtonAction

    private void checkbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox2ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardView().setVisible(true);
            }
        });
    }

  
    private void navigateTo(JFrame view) {
      view.setVisible(true); 
      this.dispose(); 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton booksButton;
    private javax.swing.JButton checkbox1;
    private javax.swing.JButton checkbox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton userButton;
    // End of variables declaration//GEN-END:variables
}
