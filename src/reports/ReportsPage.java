/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reports;

import customers.CustomersPage;
import inventoryclass.AccountPage;
import inventoryclass.HomePage;
import inventoryclass.login.Functions;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import product.ItensPage;
import suppliers.SuppliersPage;

/**
 *
 * @author Jefferson Santos
 */
public class ReportsPage extends javax.swing.JFrame {
    String USERNAME = "jeff";
    String PASSWORD = "pass";
    String CONN_STRING = "jdbc:mysql://localhost:3306/std511data";
    private java.sql.Connection connection;
    private Statement command;
    private ResultSet data;
    static String flag = "";
    /**
     * Creates new form ReportsPage
     */
    public ReportsPage(String n) {
        this.flag = n;
        initComponents();
        Functions.LoadReports();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        btnBooking = new javax.swing.JButton();
        btnSuppliers = new javax.swing.JButton();
        btnCustomers = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnAccount = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblReports = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listReports = new javax.swing.JTable();
        lstTypes = new javax.swing.JComboBox<>();
        txtFrom = new javax.swing.JFormattedTextField();
        txtTo = new javax.swing.JFormattedTextField();
        txtCode = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        btnHome.setBackground(new java.awt.Color(255, 255, 255));
        btnHome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHome.setForeground(new java.awt.Color(51, 153, 0));
        btnHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\home-5-24.png")); // NOI18N
        btnHome.setText("Home");
        btnHome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(51, 153, 0), new java.awt.Color(0, 204, 102)));
        btnHome.setMaximumSize(new java.awt.Dimension(65, 21));
        btnHome.setMinimumSize(new java.awt.Dimension(65, 21));
        btnHome.setPreferredSize(new java.awt.Dimension(65, 21));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnOrders.setBackground(new java.awt.Color(255, 255, 255));
        btnOrders.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnOrders.setForeground(new java.awt.Color(51, 153, 0));
        btnOrders.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\cart-19-24.png")); // NOI18N
        btnOrders.setText("Orders");
        btnOrders.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(51, 153, 0), new java.awt.Color(0, 204, 102)));
        btnOrders.setMaximumSize(new java.awt.Dimension(65, 21));
        btnOrders.setMinimumSize(new java.awt.Dimension(65, 21));
        btnOrders.setPreferredSize(new java.awt.Dimension(65, 21));
        btnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersActionPerformed(evt);
            }
        });

        btnBooking.setBackground(new java.awt.Color(255, 255, 255));
        btnBooking.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBooking.setForeground(new java.awt.Color(51, 153, 0));
        btnBooking.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\product-24.png")); // NOI18N
        btnBooking.setText("Booking in ");
        btnBooking.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 153), new java.awt.Color(0, 204, 102), new java.awt.Color(51, 153, 0), new java.awt.Color(0, 204, 102)));
        btnBooking.setMaximumSize(new java.awt.Dimension(65, 21));
        btnBooking.setMinimumSize(new java.awt.Dimension(65, 21));
        btnBooking.setPreferredSize(new java.awt.Dimension(65, 21));
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
        btnSuppliers.setMaximumSize(new java.awt.Dimension(65, 21));
        btnSuppliers.setMinimumSize(new java.awt.Dimension(65, 21));
        btnSuppliers.setPreferredSize(new java.awt.Dimension(65, 21));
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
        btnCustomers.setMaximumSize(new java.awt.Dimension(65, 21));
        btnCustomers.setMinimumSize(new java.awt.Dimension(65, 21));
        btnCustomers.setPreferredSize(new java.awt.Dimension(65, 21));
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
        btnReports.setMaximumSize(new java.awt.Dimension(65, 21));
        btnReports.setMinimumSize(new java.awt.Dimension(65, 21));
        btnReports.setPreferredSize(new java.awt.Dimension(65, 21));
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
        btnAccount.setMaximumSize(new java.awt.Dimension(65, 21));
        btnAccount.setMinimumSize(new java.awt.Dimension(65, 21));
        btnAccount.setPreferredSize(new java.awt.Dimension(65, 21));
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBooking, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
            .addComponent(btnSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblReports.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblReports.setForeground(new java.awt.Color(0, 204, 102));
        lblReports.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\Webp.net-resizeimage.png")); // NOI18N
        lblReports.setText("Reports");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblReports)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReports, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        listReports.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 102)));
        listReports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Code", "Description", "Price", "Sale date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        listReports.setGridColor(new java.awt.Color(0, 204, 102));
        listReports.setSelectionBackground(new java.awt.Color(0, 204, 102));
        jScrollPane1.setViewportView(listReports);

        lstTypes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lstTypes.setForeground(new java.awt.Color(0, 204, 102));
        lstTypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sales", "All Sales", "Products", "Suppliers", "Customers" }));
        lstTypes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lstTypesMouseEntered(evt);
            }
        });

        try {
            txtFrom.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTo.setToolTipText("DD/MM/YYYY");

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 204, 102));
        btnClear.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\paint-brush-24.png")); // NOI18N
        btnClear.setText("Clear all");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(255, 255, 255));
        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(0, 204, 102));
        btnPrint.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\printer-24.png")); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\jeehs\\OneDrive\\Documentos\\NetBeansProjects\\StockInventory\\src\\images\\search-2-24.png")); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("_____________________________________________________________________________________________________________________");

        jLabel3.setText("Report of:");

        jLabel4.setText("Date from:");

        jLabel5.setText("Date to");

        jLabel6.setText("Product code:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lstTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear)
                        .addGap(98, 98, 98)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lstTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1070, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        new HomePage(flag).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersActionPerformed
        // TODO add your handling code here:
        new ItensPage(flag).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrdersActionPerformed

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed
        // TODO add your handling code here:
        new ItensPage(flag).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBookingActionPerformed

    private void btnSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppliersActionPerformed
        // TODO add your handling code here:
        new SuppliersPage(flag).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSuppliersActionPerformed

    private void btnCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersActionPerformed
        // TODO add your handling code here:
        new CustomersPage(flag).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCustomersActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        // TODO add your handling code here:
        new ReportsPage(flag).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        // TODO add your handling code here:
        new AccountPage(flag).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAccountActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        String table = lstTypes.getSelectedItem().toString();

        printReport(table);


    }//GEN-LAST:event_btnPrintActionPerformed
    //Selection for the specific report
    public void printReport(String table) {
        String src = ""; 
        if (table.equals("Sales")) {
            src = "C:/Users/jeehs/OneDrive/Documentos/NetBeansProjects/StockInventory/SalesReport.jasper";
        }else if (table.equals("All Sales")) {
            src = "C:/Users/jeehs/OneDrive/Documentos/NetBeansProjects/StockInventory/AllSalesReport.jasper";
        } else if (table.equals("Products")) {
            src = "C:/Users/jeehs/OneDrive/Documentos/NetBeansProjects/StockInventory/ProductReport.jasper";
        } else if (table.equals("Suppliers")) {
            src = "C:/Users/jeehs/OneDrive/Documentos/NetBeansProjects/StockInventory/SuppliersReport.jasper";
        } else if (table.equals("Customers")) {
            src = "C:/Users/jeehs/OneDrive/Documentos/NetBeansProjects/StockInventory/CustomersReport.jasper";
        } else {
            showMessageDialog(null, "Report cannot be found");
        }

        JasperPrint jasperPrint = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            try {
                jasperPrint = JasperFillManager.fillReport(src, null, con);
            } catch (JRException ex) {
                Logger.getLogger(ReportsPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ReportsPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        JasperViewer view = new JasperViewer(jasperPrint, false);
        view.setVisible(true);
    }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtFrom.setText("");
        txtTo.setText("");
        txtCode.setText("");
        lstTypes.setSelectedItem("Sales");
        Functions.LoadReports();
    }//GEN-LAST:event_btnClearActionPerformed
    //Question if MouseEntered is the right option
    private void lstTypesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstTypesMouseEntered
        // TODO add your handling code here:
        String valid = lstTypes.getSelectedItem().toString();
        //if it is not Sales options the filter will not be available
        if (!valid.equals("Sales")) {
            txtTo.setEnabled(false);
            txtFrom.setEnabled(false);
            txtCode.setEnabled(false);
            btnSearch.setEnabled(false);
            btnClear.setEnabled(false);

        } else {
            txtTo.setEnabled(true);
            txtFrom.setEnabled(true);
            txtCode.setEnabled(true);
            btnSearch.setEnabled(true);
            btnClear.setEnabled(true);
        }
    }//GEN-LAST:event_lstTypesMouseEntered
    //Load the content according to the selected table
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String valid = lstTypes.getSelectedItem().toString();
        String dateTo = txtTo.getText();
        String dateFrom = txtFrom.getText();
        String itemCod = txtCode.getText();
        Functions.FilterSale(dateTo, dateFrom, itemCod);

    }//GEN-LAST:event_btnSearchActionPerformed
   
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
            java.util.logging.Logger.getLogger(ReportsPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportsPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportsPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportsPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportsPage(flag).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCustomers;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSuppliers;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReports;
    public static javax.swing.JTable listReports;
    private javax.swing.JComboBox<String> lstTypes;
    private javax.swing.JTextField txtCode;
    private javax.swing.JFormattedTextField txtFrom;
    private javax.swing.JFormattedTextField txtTo;
    // End of variables declaration//GEN-END:variables
}
