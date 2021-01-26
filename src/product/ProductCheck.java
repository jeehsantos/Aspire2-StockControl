package product;

import inventoryclass.OrdersPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductCheck {

    private static String username = "jeff";
    private static String password = "pass";
    private static String connectionString = "jdbc:mysql://localhost:3306/std511data";
    private static Connection connection;
    private static Statement command;
    private static ResultSet data;
   
    protected static void DeleteProduct(String codProd) {
        try {

            Connection con = DriverManager.getConnection(connectionString, username, password);
            String sql = "Delete from products where itemCod LIKE '" + codProd + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            command.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Delete Successfully.");
            //LoadData();
            // ClearAllFields();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }


    /*  public void FilterProduct(String search, String selected) {
        
        String USERNAME = "jeff";
        String PASSWORD = "pass";
        String CONN_STRING = "jdbc:mysql://localhost:3306/std511data";
        if (selected.equals("Code")) {
            selected = "itemCod";
        } else if (selected.equals("Brand")) {
            
            selected = "itemBrand";
        } else if (selected.equals("Size")) {
            selected = "itemSize";
        } else if (selected.equals("Colour")) {
            selected = "itemColour";
        }else if(selected.equals("Price")){
            double convert = Double.parseDouble(selected);
        }else if(selected.equals("Promotion")){
            double convert = Double.parseDouble(selected);
        }
        try {
            ItensPage item = new ItensPage();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);

            String sql = "SELECT * FROM `products` WHERE `" + selected + "`  LIKE ?";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, search);
            // pst.setString(2, search);
            ResultSet rs = pst.executeQuery();
            //DefaultTableModel tbl = (DefaultTableModel) item.getModel();

            //tbl.setRowCount(0);
            //continue reading from resultset when there is a record
            while (rs.next()) {
                //getting data from database field in order according to table column
                Object o[] = {rs.getString("itemDescription"),
                    rs.getString("itemSize"),
                    rs.getString("itemQuantity"),
                     rs.getString("itemColour"),
                    rs.getString("itemPrice")};
                
                
                tbl.addRow(o);  //adding record into table row
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }*/
   private static void UpdateProduct() {
        int result;
        try {
            connection = DriverManager.getConnection(connectionString, username, password);
            String sql = "Update product set firstname='Boulos', lastname='Team' where studentID='FP55845'";
            command = connection.createStatement();
            result = command.executeUpdate(sql);

            System.out.println(result);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /*private static void InsertProduct() {
        String sql = "INSERT INTO person(studentid, firstname, "
                + "lastname, gender,email, programmeID)"
                + "values('FP55845','Cloves', 'Team','Male','normal@gmail.com',"
                + "'JAVA')";
        try {
            connection = DriverManager.getConnection(connectionString, username, password);
            command = connection.createStatement();
            command.execute(sql);
            //RetrieveData("Y003358");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
    }
    private static void InsertSupplier() {
        String sql = "INSERT INTO person(studentid, firstname, "
                + "lastname, gender,email, programmeID)"
                + "values('FP55845','Cloves', 'Team','Male','normal@gmail.com',"
                + "'JAVA')";
        try {
            connection = DriverManager.getConnection(connectionString, username, password);
            command = connection.createStatement();
            command.execute(sql);
            //RetrieveData("Y003358");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
    }
*/
    
    /*public void ListProduct(String code) {
        
        try {
            Connection con = DriverManager.getConnection(connectionString, username, password);
            String sql = "Select * `products` WHERE `itemCod` LIKE ? `" + code + "`";
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                //getting data from database field in order according to table column
               Clothes product = new Clothes(rs.getString("itemCod"), rs.getString("itemType"), 
               rs.getString("itemColour"),rs.getString("itemDescription"),rs.getString("itemBrand"),
               rs.getString("itemSize"), rs.getDouble("itemPromo"), rs.getDouble("itemPrice"),
               rs.getInt("itemQuantity"));
               product.getItemCode();
            }
            OrdersPage n = new OrdersPage();
           // n.lblCode.setText(product.getItemCode());
             
                    } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }*/
}
