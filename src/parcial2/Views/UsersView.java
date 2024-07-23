package parcial2.Views;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import parcial2.Components.UpdateOrAddUserInformationFrame;
import parcial2.Data.UsersDataManager;
import parcial2.Models.User;

public final class UsersView extends javax.swing.JFrame {

    public UsersView() {
        initComponents();
        this.setResizable(false);
        
        allUsers.add(new User("1", "alice123", "Alice Johnson", "password123"));
        allUsers.add(new User("2", "bob_smith", "Bob Smith", "qwerty"));
        allUsers.add(new User("3", "charlie.brown", "Charlie Brown", "charlie123"));
        allUsers.add(new User("4", "diana_prince", "Diana Prince", "wonderwoman"));
        allUsers.add(new User("5", "evan_davis", "Evan Davis", "evanpwd"));
        showUserInformationInTable();
      
        dataManager.read();
        
    }

     public void showUserInformationInTable() {
        for (User user : allUsers) {
            String[] data = {user.getId(), user.getName(), user.getUser(), user.getPassword()};
            tableModel.addRow(data);
        }

        // Establecer celdas de la columna de contraseña como no editables
        for (int i = 0; i < allUsers.size(); i++) {
            tableModel.setCellEditable(i, 0, false);
            tableModel.setCellEditable(i, 3, false);
        }

        dataTable.setModel(tableModel);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(708, 649));

        jButton1.setText("Crear usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUsersEvent(evt);
            }
        });

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Usuario"
            }
        ));
        dataTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(dataTable);

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel1.setText("Usuarios");

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonEvent(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// AGREGAR FILA AL TOCAR BTN
    private void newUsersEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUsersEvent
        JFrame addFrame = new UpdateOrAddUserInformationFrame(true);
        this.presentFrame(addFrame);
    }//GEN-LAST:event_newUsersEvent

    private void saveButtonEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonEvent
      
    }//GEN-LAST:event_saveButtonEvent
   
    private void navigateTo(JFrame view) {
      view.setVisible(true); 
      this.dispose(); 
    }
    
    private void presentFrame(JFrame view) {
        view.setVisible(true); 
    }
        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersView().setVisible(true);
            }
        });
    }
    
     ArrayList<User> allUsers=new ArrayList<User>();
     String[] columnNames = {"Id", "Nombre", "User", "Password"};
     CustomTableModel tableModel = new CustomTableModel(columnNames, 0);
     UsersDataManager dataManager = new UsersDataManager();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}


class CustomTableModel extends DefaultTableModel {
    private boolean[][] editableCells; // Matriz para almacenar qué celdas son editables

    public CustomTableModel(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
        editableCells = new boolean[rowCount][columnNames.length];
        // Por defecto, todas las celdas son editables
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnNames.length; j++) {
                editableCells[i][j] = true;
            }
        }
    }

    public void setCellEditable(int row, int col, boolean isEditable) {
        editableCells[row][col] = isEditable;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return editableCells[row][column];
    }
    
   
   
  public void addRow(Object[] rowData) {
    super.addRow(rowData);
      if (rowData == null || rowData.length == 0) {
        return;
    }
    System.out.print(rowData);
    // Redimensionar la matriz de celdas editables
    boolean[][] newEditableCells = new boolean[getRowCount()][getColumnCount()];
    
    // Copiar las celdas editables existentes a la nueva matriz
    for (int i = 0; i < editableCells.length; i++) {
        System.arraycopy(editableCells[i], 0, newEditableCells[i], 0, editableCells[i].length);
    }
    
    // Marcar la nueva fila como editable por defecto
    for (int i = 0; i < getColumnCount(); i++) {
        newEditableCells[getRowCount() - 1][i] = true;
    }
    
    // Actualizar la matriz editableCells
    editableCells = newEditableCells;
} 
}