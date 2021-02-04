package inventoryclass.login;

import com.mysql.jdbc.PreparedStatement;
import customers.Customers;
import customers.CustomersForm;
import static customers.CustomersForm.txtPhone;
import customers.CustomersPage;
import inventoryclass.AccountPage;
import static inventoryclass.AccountPage.cboActive;
import static inventoryclass.AccountPage.txtEmail;
import static inventoryclass.AccountPage.txtName;
import static inventoryclass.AccountPage.txtPassword;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import product.Clothes;
import product.ItensPage;
import static product.ItensPage.listProducts;
import product.ProductForm;
import static product.ProductForm.spnQuantity;
import static product.ProductForm.txtItemBrand;
import static product.ProductForm.txtItemCod;
import static product.ProductForm.txtItemColour;
import static product.ProductForm.txtItemDescription;
import static product.ProductForm.txtItemPrice;
import static product.ProductForm.txtItemPromo;
import static product.ProductForm.txtItemSize;
import static product.ProductForm.txtItemType;
import product.Products;
import reports.ReportsPage;
import suppliers.Suppliers;
import suppliers.SuppliersForm;
import suppliers.SuppliersPage;
import static suppliers.SuppliersPage.listSuppliers;

/**
 *
 * @author Jefferson Santos
 */
public class Functions {

    private static final PreparedStatement ps = null;
    private static final String USERNAME = "jeff";
    private static final String PASSWORD = "pass";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/std511data";
    static String flag = "";
    Date date = Calendar.getInstance().getTime();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String strDate = dateFormat.format(date);

    //Get login info and check if the guest data exist in the database
    public boolean VerifyUser(String userContent, String passwordContent) {
        boolean check = false;

        ResultSet rs = null;
        try {

            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "SELECT * FROM `users` WHERE `email` LIKE ? AND `password` LIKE ?";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, userContent);
            pst.setString(2, passwordContent);
            rs = pst.executeQuery();

            if (rs.next()) {
                check = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return check;
    }

    //Method to check if the register already exist on database if dont register a new user
    public static boolean isRegister(User guest) {
        try {
            //String sql = User.UPDATE;
            java.sql.Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "Insert into users(fullName,password,email,admin,active)"
                    + "values(?,?,?,?,?)";

            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, guest.getName());
            pst.setString(2, guest.getPassword());
            pst.setString(3, guest.getEmail());
            pst.setString(4, guest.isAdmin());
            pst.setString(5, guest.isActive());
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
            // Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Get the current logged user
    public static void CurrentUser(String s) {
        ResultSet rs = null;
        String email = s;
        User current = new User();
        try {
            String sql = "SELECT * FROM users WHERE email LIKE '" + s + "'";
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            java.sql.PreparedStatement pst = con.prepareStatement(sql);

            rs = pst.executeQuery();
            while (rs.next()) {
                current.setName(rs.getString("fullName"));
                current.setPassword(rs.getString("password"));
                current.setEmail(rs.getString("email"));
                current.setAdmin(rs.getString("admin"));
                current.setActive(rs.getString("active"));
                AccountPage.LoadUser(current);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    /*
           ------------------------ PRODUCT SESSION-----------------------------
     */
    //Method to load products
    public static void LoadProducts() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = Products.LIST;
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tbl = (DefaultTableModel) listProducts.getModel();
            tbl.setRowCount(0);
            //continue reading from resultset when there is a record
            while (rs.next()) {
                //getting data from database field in order according to table column
                Object o[] = {rs.getString("ItemCod"),
                    rs.getString("itemDescription"),
                    rs.getString("itemSize"),
                    rs.getInt("itemQuantity"),
                    rs.getString("itemColour"),
                    rs.getDouble("itemPrice")};
                tbl.addRow(o);  //adding record into table row
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Method to load specific data(product) according to the filled fields
    public static void setListar(String search, String selected) {

        if (selected.equals("Code")) {
            selected = "itemCod";
        } else if (selected.equals("Brand")) {

            selected = "itemBrand";
        } else if (selected.equals("Size")) {
            selected = "itemSize";
        } else if (selected.equals("Colour")) {
            selected = "itemColour";
        } else if (selected.equals("Price")) {
            double convert = Double.parseDouble(selected);
        } else if (selected.equals("Promotion")) {
            double convert = Double.parseDouble(selected);
        } else if (selected.equals("Description")) {
            selected = "itemDescription";
        } else if (selected.equals("Type")) {
            selected = "itemType";
        }
        try {
            String sql = "";
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);

            if (search.equals("")) {
                sql = Products.LIST;
            } else {
                sql = "SELECT * FROM `products` WHERE `" + selected + "`  LIKE ?";
            }
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, search);
            // pst.setString(2, search);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tbl = (DefaultTableModel) ItensPage.listProducts.getModel();
            tbl.setRowCount(0);
            //continue reading from resultset when there is a record
            while (rs.next()) {
                //getting data from database field in order according to table column
                Object o[] = {rs.getString("itemCod"),
                    rs.getString("itemDescription"),
                    rs.getString("itemSize"),
                    rs.getInt("itemQuantity"),
                    rs.getString("itemColour"),
                    rs.getDouble("itemPrice")};

                tbl.addRow(o);  //adding record into table row
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //delete the selected product
    public static void DeleteProduct(int s) {

        DefaultTableModel tblModel = (DefaultTableModel) ItensPage.listProducts.getModel();
        int i = ItensPage.listProducts.getSelectedRow();
        if (ItensPage.listProducts.getSelectedRow() != - 1) {
            String itemDesc = tblModel.getValueAt(i, 0).toString();

            try {

                java.sql.Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                String sql = "Delete from `products` where `itemCod` LIKE '" + itemDesc + "'";
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Deleted Successfully.");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            LoadProducts();
        }
    }

    //Load the product register on the Product form fields
    public static void LoadProductForm() {
        int n = 2;
        DefaultTableModel tblModel = (DefaultTableModel) ItensPage.listProducts.getModel();
        int i = ItensPage.listProducts.getSelectedRow();
        if (ItensPage.listProducts.getSelectedRow() != - 1) {

            String itemCode = tblModel.getValueAt(i, 0).toString();

            try {

                ProductForm edit = new ProductForm(n);
                java.sql.Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                //Search the selected row according to its Code
                String sql = "SELECT * FROM `products` WHERE `itemCod`  LIKE ?";
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, itemCode);
                //ResultSet rs =  pst.executeUpdate();
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String sf1 = rs.getString("itemPromo");
                    //Get the contents from the database and load on the fields
                    ProductForm.txtItemCod.setText(rs.getString("itemCod"));
                    ProductForm.txtItemType.setText(rs.getString("itemType"));
                    ProductForm.txtItemBrand.setText(rs.getString("itemBrand"));
                    ProductForm.txtItemSize.setText(rs.getString("itemSize"));
                    ProductForm.txtItemColour.setText(rs.getString("itemColour"));
                    ProductForm.txtItemDescription.setText(rs.getString("itemDescription"));
                    ProductForm.txtItemPrice.setText(String.valueOf(rs.getDouble("itemPrice")));
                    ProductForm.txtItemPromo.setText(String.valueOf(rs.getDouble("itemPromo")));
                    ProductForm.spnQuantity.setValue(rs.getInt("itemQuantity"));
                    edit.setVisible(true);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }

    //browse for a product
    public String searchProduct(String keys) {

        String itemCod = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "Select * from products where itemCod='" + keys + "'";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            //continue reading from resultset when there is a record
            while (rs.next()) {
                //getting data from database field in order according to table column
                itemCod = rs.getString("itemCod");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {

        }
        return itemCod;
    }

    // new product register
    public static void IncludeProduct(Clothes guest) {
        try {
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "Insert into products(itemCod,itemType,itemBrand,itemSize,itemColour,itemDescription,itemPrice,itemPromo,itemQuantity)"
                    + "values(?,?,?,?,?,?,?,?,?)";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, guest.getCode());
            pst.setString(2, guest.getType());
            pst.setString(3, guest.getBrand());
            pst.setString(4, guest.getSize());
            pst.setString(5, guest.getColour());
            pst.setString(6, guest.getDescription());
            pst.setDouble(7, guest.getPrice());
            pst.setDouble(8, guest.getPromo());
            pst.setInt(9, guest.getQuantity());

            int result = pst.executeUpdate();
            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Registered Succesfully.");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    //If the product already exist, the system will agregate the quantity

    public static void SumProduct() {

        try {
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "Update products set itemCod=?,itemType=?,itemBrand=?,"
                    + "itemSize = ?, itemColour = ?, itemDescription = ?,"
                    + "itemPrice = ?, itemPromo = ?, itemQuantity = itemQuantity + ? where itemCod=?";

            java.sql.PreparedStatement pst = con.prepareStatement(sql);

            String value = spnQuantity.getValue() + "";

            pst.setString(1, txtItemCod.getText());
            pst.setString(2, txtItemType.getText());
            pst.setString(3, txtItemBrand.getText());
            pst.setString(4, txtItemSize.getText());
            pst.setString(5, txtItemColour.getText());
            pst.setString(6, txtItemDescription.getText());
            pst.setDouble(7, Double.parseDouble(txtItemPrice.getText()));
            pst.setDouble(8, Double.parseDouble(txtItemPromo.getText()));
            //question
            pst.setString(9, value);
            pst.setString(10, txtItemCod.getText());

            int result = pst.executeUpdate();
            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Updated Successfully.");

                //update the table
                Functions.LoadProducts();
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //Update the product according to the values from the form
    public static void UpdateProduct() {
        DefaultTableModel tblModel = (DefaultTableModel) ItensPage.listProducts.getModel();
        int i = ItensPage.listProducts.getSelectedRow();
        if (ItensPage.listProducts.getSelectedRow() != - 1) {
            String itemCode = tblModel.getValueAt(i, 0).toString();

            try {
                Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                String sql = "Update products set itemCod=?,itemType=?,itemBrand=?,"
                        + "itemSize = ?, itemColour = ?, itemDescription = ?,"
                        + "itemPrice = ?, itemPromo = ?, itemQuantity =  ? where itemCod=?";

                java.sql.PreparedStatement pst = con.prepareStatement(sql);

                String value = spnQuantity.getValue() + "";

                pst.setString(1, txtItemCod.getText());
                pst.setString(2, txtItemType.getText());
                pst.setString(3, txtItemBrand.getText());
                pst.setString(4, txtItemSize.getText());
                pst.setString(5, txtItemColour.getText());
                pst.setString(6, txtItemDescription.getText());
                pst.setDouble(7, Double.parseDouble(txtItemPrice.getText()));
                pst.setDouble(8, Double.parseDouble(txtItemPromo.getText()));
                //question
                pst.setString(9, value);
                pst.setString(10, itemCode);

                int result = pst.executeUpdate();
                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Updated Successfully.");

                    //update the table
                    Functions.LoadProducts();
                }
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    /*========================================================================
                                Customers Section
     */
    //Get the values to filter and show a specific register
    public static void FilterCustomer(String search, String selected) {
        if (selected.equals("Name")) {
            selected = "name";
        } else if (selected.equals("Phone")) {
            selected = "phone";
        } else if (selected.equals("Gender")) {
            selected = "gender";
        } else if (selected.equals("Date of Birth")) {
            selected = "dateBirth";
        } else if (selected.equals("City")) {
            selected = "city";

        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);

            String sql = "SELECT * FROM `customers` WHERE `" + selected + "`  LIKE ?";

            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, search);
            // pst.setString(2, search);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tbl = (DefaultTableModel) CustomersPage.listCustomers.getModel();
            tbl.setRowCount(0);
            //continue reading from resultset when there is a record
            while (rs.next()) {
                //getting data from database field in order according to table column
                Object o[] = {rs.getString("name"),
                    rs.getString("phone"),
                    rs.getString("city")};

                tbl.addRow(o);  //adding record into table row
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Update the table loading the registered Customers
    public static void LoadCustomers() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "Select * from customers";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tbl = (DefaultTableModel) CustomersPage.listCustomers.getModel();
            tbl.setRowCount(0);
            //continue reading from resultset when there is a record
            while (rs.next()) {
                //getting data from database field in order according to table column
                Object o[] = {rs.getString("name"),
                    rs.getString("phone"),
                    rs.getString("city")};
                tbl.addRow(o);  //adding record into table row
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Register a new user
    public static void RegisterCustomer(Customers guest) {
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            //com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "Insert into customers(name,email,phone,city,gender,dateBirth,dateInclusion)"
                    + "values(?,?,?,?,?,?,?)";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, guest.getName());
            pst.setString(2, guest.getEmail());
            pst.setString(3, String.valueOf(guest.getPhone()));
            pst.setString(4, guest.getCity());
            pst.setString(5, guest.getGender());
            pst.setString(6, guest.getDateBirth());
            pst.setString(7, guest.getDateInclusion());

            int result = pst.executeUpdate();
            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Registered Succesfully.");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //check if Customer email already exist
    public static boolean CheckCustomerEmail(String keys) {

        boolean email = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "SELECT * FROM `customers` WHERE `email` LIKE'" + keys + "'";

            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            //continue reading from resultset when there is a record
            while (rs.next()) {
                //getting data from database field in order according to table column
                email = true;

            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {

        }
        return email;
    }

    //Load the Customer register on the Customer form fields
    public static void LoadCustomersForm() {
        int n = 2;
        DefaultTableModel tblModel = (DefaultTableModel) CustomersPage.listCustomers.getModel();
        int i = CustomersPage.listCustomers.getSelectedRow();
        if (CustomersPage.listCustomers.getSelectedRow() != - 1) {

            String name = tblModel.getValueAt(i, 0).toString();

            try {

                CustomersForm edit = new CustomersForm(n);
                java.sql.Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                //Search the selected row according to its Code
                String sql = "SELECT * FROM `customers` WHERE `name`  LIKE ?";
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, name);
                //ResultSet rs =  pst.executeUpdate();
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    //Get the contents from the database and load on the fields
                    CustomersForm.txtName.setText(rs.getString("name"));
                    CustomersForm.txtEmail.setText(rs.getString("email"));
                    CustomersForm.txtCity.setText(rs.getString("city"));
                    CustomersForm.txtDate.setText(rs.getString("dateInclusion"));
                    CustomersForm.txtPhone.setText(rs.getString("phone"));
                    CustomersForm.txtBirth.setText(rs.getString("dateBirth"));
                    if (rs.getString("gender").equals("Female")) {
                        CustomersForm.rdoFemale.setSelected(true);
                    } else {
                        CustomersForm.rdoMale.setSelected(true);
                    }

                    edit.setVisible(true);
                }
                //JOptionPane.showMessageDialog(null, "Item edited Successfully.");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }

    //Delete the selected customer from the table (selected row)
    public static void DeleteCustomer(int n) {
        if (n == 0) {
            DefaultTableModel tblModel = (DefaultTableModel) CustomersPage.listCustomers.getModel();
            int i = CustomersPage.listCustomers.getSelectedRow();
            if (CustomersPage.listCustomers.getSelectedRow() != - 1) {

                String name = tblModel.getValueAt(i, 0).toString();

                try {

                    Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                    String sql = "Delete from customers where name LIKE '" + name + "'";
                    java.sql.PreparedStatement pst = con.prepareStatement(sql);
                    pst.executeUpdate();
                    Functions.LoadCustomers();
                    JOptionPane.showMessageDialog(null, "Delete Successfully.");

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }
        }
    }

    //Update the customer according to the values from the form
    public static void UpdateCustomer() {
        DefaultTableModel tblModel = (DefaultTableModel) CustomersPage.listCustomers.getModel();
        int i = CustomersPage.listCustomers.getSelectedRow();
        String updGender = "";
        String numb1 = txtPhone.getText().substring(1, 3);
        String numb2 = txtPhone.getText().substring(4, 8);
        String numb3 = txtPhone.getText().substring(9);
        if (CustomersPage.listCustomers.getSelectedRow() != - 1) {
            String itemName = tblModel.getValueAt(i, 0).toString();

            try {

                Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                String sql = "UPDATE customers SET email=?,phone=?,city=?,"
                        + "gender = ?, dateBirth = ?, name = ?,"
                        + "dateInclusion = ? WHERE name=?";

                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                if (CustomersForm.rdoFemale.isSelected()) {
                    updGender = "Female";
                } else {
                    updGender = "Male";
                }

                pst.setString(1, CustomersForm.txtEmail.getText());
                pst.setString(2, numb1 + numb2 + numb3);
                pst.setString(3, CustomersForm.txtCity.getText());
                pst.setString(4, updGender);
                pst.setString(5, CustomersForm.txtBirth.getText());
                pst.setString(6, CustomersForm.txtName.getText());
                pst.setString(7, CustomersForm.txtDate.getText());
                pst.setString(8, itemName);

                int result = pst.executeUpdate();
                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Updated Successfully.");

                    //update the table
                    Functions.LoadCustomers();
                }
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    /*
        --------------------------Suppliers Section------------------------
     */
    //Filter the register according to the parameters
    public static void FilterSupplier(String search, String selected) {
        if (selected.equals("Name")) {
            selected = "name";
        } else if (selected.equals("Email")) {
            selected = "email";
        } else if (selected.equals("Nickname")) {
            selected = "nickName";
        } else if (selected.equals("Address")) {
            selected = "address";
        } else if (selected.equals("City")) {
            selected = "City";
        } else if (selected.equals("Product")) {
            selected = "product";

        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);

            String sql = "SELECT * FROM `suppliers` WHERE `" + selected + "`  LIKE ?";

            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, search);
            // pst.setString(2, search);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tbl = (DefaultTableModel) SuppliersPage.listSuppliers.getModel();
            tbl.setRowCount(0);
            //continue reading from resultset when there is a record
            while (rs.next()) {
                //getting data from database field in order according to table column
                Object o[] = {rs.getString("nickName"),
                    rs.getString("phone"),
                    rs.getString("product"),
                    rs.getString("city")};

                tbl.addRow(o);  //adding record into table row
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Refresh and load the Suppliers table
    public static void LoadSuppliers() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "SELECT * FROM suppliers";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tbl = (DefaultTableModel) listSuppliers.getModel();
            tbl.setRowCount(0);
            //continue reading from resultset when there is a record
            while (rs.next()) {
                //getting data from database field in order according to table column
                Object o[] = {rs.getString("nickName"),
                    rs.getString("phone"),
                    rs.getString("product"),
                    rs.getString("city")};
                tbl.addRow(o);  //adding record into table row
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Valid if supplier email is register in database
    public static boolean SearchSupplier(String keys) {

        boolean email = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "Select * from suppliers where email='" + keys + "'";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            //continue reading from resultset when there is a record
            while (rs.next()) {
                //getting data from database field in order according to table column
                email = true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {

        }
        return email;
    }

    //Register a new supplier
    public static void RegisterSupplier(Suppliers guest) {
        try {

            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "Insert into suppliers(nickName,email,name,address,city,postcode,phone,product, dateinclusion)"
                    + "values(?,?,?,?,?,?,?,?,?)";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, guest.getNickName());
            pst.setString(2, guest.getEmail());
            pst.setString(3, guest.getName());
            pst.setString(4, guest.getAddress());
            pst.setString(5, guest.getCity());
            pst.setString(6, guest.getPostcode());
            pst.setString(7, String.valueOf(guest.getPhone()));
            pst.setString(8, guest.getProduct());
            pst.setString(9, guest.getDateInclusion());

            int result = pst.executeUpdate();
            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Registered Succesfully.");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //Delete the selected supplier on the table
    public static void DeleteSupplier(int n) {
        if (n == 0) {
            DefaultTableModel tblModel = (DefaultTableModel) listSuppliers.getModel();
            int i = listSuppliers.getSelectedRow();
            if (listSuppliers.getSelectedRow() != - 1) {

                String nickName = tblModel.getValueAt(i, 0).toString();

                try {

                    Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                    String sql = "Delete from suppliers where nickName LIKE '" + nickName + "'";
                    java.sql.PreparedStatement pst = con.prepareStatement(sql);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Delete Successfully.");
                    Functions.LoadSuppliers();

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }
        }
    }

    //Load the supplier form updating the table
    public static void LoadSupplierForm() {
        int n = 2;
        DefaultTableModel tblModel = (DefaultTableModel) SuppliersPage.listSuppliers.getModel();
        int i = SuppliersPage.listSuppliers.getSelectedRow();
        if (SuppliersPage.listSuppliers.getSelectedRow() != - 1) {

            String nickName = tblModel.getValueAt(i, 0).toString();

            try {

                SuppliersForm edit = new SuppliersForm(n);
                java.sql.Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                //Search the selected row according to its Code
                String sql = "SELECT * FROM `suppliers` WHERE `nickName`  LIKE ?";
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, nickName);
                //ResultSet rs =  pst.executeUpdate();
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    //Get the contents from the database and load on the fields
                    SuppliersForm.txtNickname.setText(rs.getString("nickName"));
                    SuppliersForm.txtEmail.setText(rs.getString("email"));
                    SuppliersForm.txtName.setText(rs.getString("name"));
                    SuppliersForm.txtAddress.setText(rs.getString("address"));
                    SuppliersForm.txtCity.setText(rs.getString("city"));
                    SuppliersForm.txtPostcode.setText(rs.getString("postcode"));
                    SuppliersForm.txtPhone.setText(String.valueOf(rs.getString("phone")));
                    SuppliersForm.txtProduct.setText(String.valueOf(rs.getString("product")));
                    SuppliersForm.txtDate.setText((rs.getString("dateInclusion")));
                    edit.setVisible(true);
                }
                //JOptionPane.showMessageDialog(null, "Item edited Successfully.");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }

    //Update the supplier according to the values from the form
    public static void UpdateSupplier() {
        DefaultTableModel tblModel = (DefaultTableModel) SuppliersPage.listSuppliers.getModel();
        int i = SuppliersPage.listSuppliers.getSelectedRow();

        if (SuppliersPage.listSuppliers.getSelectedRow() != - 1) {
            String itemName = tblModel.getValueAt(i, 0).toString();

            try {

                Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                String sql = "UPDATE suppliers SET nickName=?,email=?,name=?,"
                        + "address = ?, city = ?, postcode = ?,"
                        + "phone = ?, product = ? WHERE nickName=?";

                java.sql.PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, SuppliersForm.txtNickname.getText());
                pst.setString(2, SuppliersForm.txtEmail.getText());
                pst.setString(3, SuppliersForm.txtName.getText());
                pst.setString(4, SuppliersForm.txtAddress.getText());
                pst.setString(5, SuppliersForm.txtCity.getText());
                pst.setString(6, SuppliersForm.txtPostcode.getText());
                pst.setString(7, SuppliersForm.txtPhone.getText());
                pst.setString(8, SuppliersForm.txtProduct.getText());
                pst.setString(9, itemName);

                int result = pst.executeUpdate();
                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Updated Successfully.");

                    //update the table
                    Functions.LoadSuppliers();
                }
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    /*
    ---------------------------Orders Page ------------------------------------
     */
    //insert in the database a register with the total of the sale
    public void FinishSale(double saleTotal) {

        try {

            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "INSERT INTO `sales`(`sale_total`, `sale_date`) VALUES (?,?)";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setDouble(1, saleTotal);
            pst.setString(2, strDate);

            int result = pst.executeUpdate();
            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Sale completed ! ");
            }

        } catch (SQLException ex) {

            // Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
    ------------------------------Reports page---------------------------------
     */
    //Load the sales in the report's table
    public static void LoadReports() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "Select * from items_sale_product";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tbl = (DefaultTableModel) ReportsPage.listReports.getModel();
            tbl.setRowCount(0);
            //continue reading from resultset when there is a record
            while (rs.next()) {
                //getting data from database field in order according to table column
                Object o[] = {rs.getString("cod_prod"),
                    rs.getString("prod_desc"),
                    rs.getString("prod_price"),
                    rs.getString("sale_date")};
                tbl.addRow(o);  //adding record into table row
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Filter the register according to the parameters
    public static void FilterSale(String dateTo, String dateFrom, String code) {
        DefaultTableModel tbl = (DefaultTableModel) ReportsPage.listReports.getModel();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);

            String sql = "Select * From items_sale_product where cod_prod = ? OR sale_date BETWEEN  ? AND ? ";

            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, code);
            pst.setString(2, dateTo);
            pst.setString(3, dateFrom);
            // pst.setString(2, search);
            ResultSet rs = pst.executeQuery();

            tbl.setRowCount(0);
            //continue reading from resultset when there is a record
            while (rs.next()) {
                //getting data from database field in order according to table column
                Object o[] = {rs.getString("cod_prod"),
                    rs.getString("prod_desc"),
                    rs.getString("prod_price"),
                    rs.getString("sale_date")};

                tbl.addRow(o);  //adding record into table row
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /*
    ---------------------------ACCOUNT SESSION------------------------------
    */
    
   //Update user infos
    public static void UpdateUser(String email) {
         String checkAdmin = "";
        try {

            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "UPDATE `users` SET `fullName`= ?,`password`=?,"
                    + "`email`= ? ,`admin`= ? ,`active`= ? WHERE `email`= ? ";
            if (AccountPage.cboAdmin.isSelected()) {
                checkAdmin = ("1");
            } else {
                checkAdmin = ("2");

            }
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, txtName.getText());
            pst.setString(2, txtPassword.getText());
            pst.setString(3, txtEmail.getText());
            pst.setString(4, checkAdmin);
            pst.setString(5, cboActive.getSelectedItem().toString());
            pst.setString(6, email);

            int result = pst.executeUpdate();
            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Updated Successfully.");

                //update the table
                LoadCustomers();
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
