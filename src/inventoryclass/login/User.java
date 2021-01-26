package inventoryclass.login;

public class User extends Person {

    private String  password, admin, active;

    public static String LIST = "SELECT * FROM users";

    public static String REGISTER = "INSERT INTO users("
            + "fullName,"
            +"password,"
            +"email,"
            +"admin,"
            +"active)"
            +"VALUES(?,?,?,?,?)";

   /* public static String UPDATE = "UPDATE users SET"
                +"fullName = ?,"
                +"password = ?,"
                +"email = ?,"
                +"admin = ?,"
                +"active = ?";*/

    public User() {
       
        this.password = password;
        this.email = email;
        this.admin = admin;
        this.active = active;
    }

    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String isAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String isActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
