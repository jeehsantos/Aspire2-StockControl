package inventoryclass.login;

public class User {

    private String fullName, password, repassword, email, admin, active;

    /*public User() {
        this.setFullName(fullName);
        this.setPassword(password);
        this.setRepassword(repassword);
        this.setEmail(email);
        this.setAdmin(admin);
        this.setActive(active);
    }*/
    public User(String fullName, String email, String password, String admin, String active) {
        this.fullName = fullName;
        this.password = password;
        this.email = email;
        this.admin = admin;
        this.active = active;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
