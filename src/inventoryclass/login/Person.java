package inventoryclass.login;

/**
 *
 * @author Jefferson Santos
 */
public abstract class Person {
    protected String name, email, dateInclusion, city;
    protected int phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateInclusion() {
        return dateInclusion;
    }

    public void setDateInclusion(String dateInclusion) {
        this.dateInclusion = dateInclusion;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    
}
