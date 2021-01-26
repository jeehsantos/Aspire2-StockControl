package inventoryclass.login;

import inventoryclass.AccountPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class UserCheck {

    private final String USERNAME = "jeff";
    private final String PASSWORD = "pass";
    private final String CONN_STRING = "jdbc:mysql://localhost:3306/std511data";
    //Method to check if the register already exist on database
    public boolean VerifyUser(String userContent, String passwordContent) {
        boolean check = false;
        
        ResultSet rs = null;
        try {
         
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "SELECT * FROM `users` WHERE `email` LIKE ? AND `password` LIKE ?";
            PreparedStatement pst = con.prepareStatement(sql);
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

    public boolean validateFields(String passRepeat, String password, String email,
        String name, String active, String admin) {
        
        boolean check = false;
        if (passRepeat.equals("") && name.equals("")
                && email.equals("") && password.equals("")) {
            showMessageDialog(null, "Please fill the fields for registration");
           
        } else if (passRepeat.equals("")) {
            showMessageDialog(null, "Repeat password field is null");
        } else if (name.equals("")) {
            showMessageDialog(null, "Name field is null");
        } else if (email.equals("")) {
            showMessageDialog(null, "Email field is null");
        } else if (password.equals("")) {
            showMessageDialog(null, "Password field is null");
        } else {
            if (passRepeat.equals(password)) {
                User newUser = new User(name,password, email, admin, active );
                SaveToDatabase(newUser);
                check = true;
            } else {
                showMessageDialog(null, "Your passwords does not match");
            }
        }
     return check;
    }
    //Method getLogin is used to send information to the AccountPage and load as constructor
    public void getLogin(String emailSection) {
         
        AccountPage infoUser = new AccountPage();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "Select * from users where `email` LIKE ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, emailSection);
            ResultSet rs = pst.executeQuery();
            //continue reading from resultset when there is a record
           
                //getting data from database field in order according to table column
                if(rs.next()){
                  User currentUser = new User(rs.getString("fullName"),rs.getString("password"), rs.getString("email"),rs.getString("admin"),
                                        rs.getString("active"));
                    /*currentUser.setFullName(rs.getString("fullName"));
                    currentUser.setPassword(rs.getString("password"));
                    currentUser.setEmail(rs.getString("email"));
                    currentUser.setAdmin(rs.getString("admin"));
                    currentUser.setActive(rs.getString("active")); */
                    infoUser.LoadUser(currentUser);
                }       
                
               
        }catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
    }
}
    protected void SaveToDatabase(User guest) {
        try {
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            String sql = "Insert into users(fullName,password,email,admin,active)"
                    + "values(?,?,?,?,?)";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, guest.getFullName());
            pst.setString(2, guest.getPassword());
            pst.setString(3, guest.getEmail());
            pst.setString(4, guest.isAdmin());
            pst.setString(5, guest.isActive());

            int result = pst.executeUpdate();
            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Registered Succesfully.");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
