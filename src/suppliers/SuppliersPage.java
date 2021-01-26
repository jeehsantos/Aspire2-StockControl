/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suppliers;

import customers.CustomersPage;
import inventoryclass.AccountPage;
import inventoryclass.HomePage;
import inventoryclass.login.Functions;
import javax.swing.JOptionPane;
import product.ItensPage;
import reports.ReportsPage;

/**
 *
 * @author Jefferson Santos
 */
public class SuppliersPage extends javax.swing.JFrame {
    int flag = 1;
    static String currentUser = " ";
    /**
     * Creates new form Suppliers
     */
    public SuppliersPage(String n) {
        initComponents();
        this.currentUser = n;
        Functions.LoadSuppliers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        teste = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnBooking = new javax.swing.JButton();
        btnSuppliers = new javax.swing.JButton();
        btnCustomers = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnAccount = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSuppliers = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnInclude = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        cboSelected = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        teste.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(877, 500));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        jPanel12.setPreferredSize(new java.awt.Dimension(165, 400));

        btnHome.setBackground(new java.awt.Color(255, 255, 255));
        btnHome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHome.setForeground(new java.awt.Color(51, 153, 0));
        btnHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\home-5-24.png")); // NOI18N
        btnHome.setText("Home");
        btnHome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(51, 153, 0), new java.awt.Color(0, 204, 102)));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnBooking.setBackground(new java.awt.Color(255, 255, 255));
        btnBooking.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBooking.setForeground(new java.awt.Color(51, 153, 0));
        btnBooking.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\product-24.png")); // NOI18N
        btnBooking.setText("Booking in");
        btnBooking.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(51, 153, 0), new java.awt.Color(0, 204, 102)));
        btnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingActionPerformed(evt);
            }
        });

        btnSuppliers.setBackground(new java.awt.Color(255, 255, 255));
        btnSuppliers.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSuppliers.setForeground(new java.awt.Color(51, 153, 0));
        btnSuppliers.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\truck-2-24.png")); // NOI18N
        btnSuppliers.setText("Suppliers");
        btnSuppliers.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(51, 153, 0), new java.awt.Color(0, 204, 102)));
        btnSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppliersActionPerformed(evt);
            }
        });

        btnCustomers.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomers.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCustomers.setForeground(new java.awt.Color(51, 153, 0));
        btnCustomers.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\buy-24.png")); // NOI18N
        btnCustomers.setText("Customers");
        btnCustomers.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(51, 153, 0), new java.awt.Color(0, 204, 102)));
        btnCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomersActionPerformed(evt);
            }
        });

        btnReports.setBackground(new java.awt.Color(255, 255, 255));
        btnReports.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReports.setForeground(new java.awt.Color(51, 153, 0));
        btnReports.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\printer-24.png")); // NOI18N
        btnReports.setText("Reports");
        btnReports.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(51, 153, 0), new java.awt.Color(0, 204, 102)));
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });

        btnAccount.setBackground(new java.awt.Color(255, 255, 255));
        btnAccount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAccount.setForeground(new java.awt.Color(51, 153, 0));
        btnAccount.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\settings-23-24.png")); // NOI18N
        btnAccount.setText("Account");
        btnAccount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(51, 153, 0), new java.awt.Color(0, 204, 102)));
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });

        btnOrders.setBackground(new java.awt.Color(255, 255, 255));
        btnOrders.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnOrders.setForeground(new java.awt.Color(51, 153, 0));
        btnOrders.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\cart-19-24.png")); // NOI18N
        btnOrders.setText("Orders");
        btnOrders.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(51, 153, 0), new java.awt.Color(0, 204, 102)));
        btnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
            .addComponent(btnReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 102));

        txtSearch.setForeground(new java.awt.Color(0, 153, 0));
        txtSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 102)));
        txtSearch.setSelectionColor(new java.awt.Color(0, 204, 102));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        listSuppliers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nickname", "Phone", "Product", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listSuppliers.setGridColor(new java.awt.Color(0, 204, 102));
        listSuppliers.setSelectionBackground(new java.awt.Color(0, 204, 102));
        jScrollPane1.setViewportView(listSuppliers);

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setForeground(new java.awt.Color(0, 204, 102));
        btnEdit.setText("Edit item");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setForeground(new java.awt.Color(0, 204, 102));
        btnDelete.setText("Delete item");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnInclude.setBackground(new java.awt.Color(255, 255, 255));
        btnInclude.setForeground(new java.awt.Color(0, 204, 102));
        btnInclude.setText("Include item");
        btnInclude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncludeActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setForeground(new java.awt.Color(0, 204, 102));
        btnSearch.setText("Search item");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        cboSelected.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Email", "Nickname", "Address", "City", "Product" }));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\truck-2-64.png")); // NOI18N
        jLabel1.setText("Suppliers");

        btnRefresh.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\refresh-32.png")); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRefresh)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboSelected, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnSearch)
                .addGap(18, 18, 18)
                .addComponent(btnInclude)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cboSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnInclude)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(893, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        new HomePage(currentUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed
        // TODO add your handling code here:
        new ItensPage(currentUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBookingActionPerformed
    
    //goes to suppliers page
    private void btnSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppliersActionPerformed
        // TODO add your handling code here:
        new SuppliersPage(currentUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSuppliersActionPerformed
    //goes to customers page
    private void btnCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersActionPerformed
        // TODO add your handling code here:
        new CustomersPage(currentUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCustomersActionPerformed
    //goes to reports page
    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        // TODO add your handling code here:
        new ReportsPage(currentUser).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnReportsActionPerformed
    //goes to account setting page
    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        // TODO add your handling code here:
        new AccountPage(currentUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAccountActionPerformed
    //goes to orders page
    private void btnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersActionPerformed
        // TODO add your handling code here:
        new SuppliersPage(currentUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrdersActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        flag = 2; 
        Functions.LoadSupplierForm();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null, "Do you want to delete the selected supplier?", "DELETE OPTION", JOptionPane.YES_NO_OPTION);
        Functions.DeleteSupplier(n);
    }//GEN-LAST:event_btnDeleteActionPerformed
    //calls the supplier form
    private void btnIncludeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncludeActionPerformed
        // TODO add your handling code here:
        flag = 1;
        new SuppliersForm(flag).setVisible(true);
        Functions.LoadSuppliers();
    }//GEN-LAST:event_btnIncludeActionPerformed
    //get the value in the box and texbox and calls the function filterData
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String selected = cboSelected.getSelectedItem().toString();

        String search = txtSearch.getText();
        //Question
        Functions.FilterSupplier(search, selected);
    }//GEN-LAST:event_btnSearchActionPerformed
    
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        Functions.LoadSuppliers();
        txtSearch.setText("");

    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(SuppliersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuppliersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuppliersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuppliersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuppliersPage(currentUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnCustomers;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnInclude;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSuppliers;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboSelected;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable listSuppliers;
    private javax.swing.JMenuItem teste;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
