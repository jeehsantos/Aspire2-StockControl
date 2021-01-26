package connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jefferson Santos
 */
public class Connection {
    
    public static Connection connection = null;
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/std511data","jeff","pass");
            return connection;
        } catch (SQLException | ClassNotFoundException ex) {
            //Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
            
    }
}
