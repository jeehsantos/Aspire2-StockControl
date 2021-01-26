package customers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jefferson Santos
 */
public class Customers {

    String name, email, city, gender, dateInclusion, dateBirth;
    int phone;
    //Constructor
    public Customers() {
        this.name = name;
        this.email = email;
        this.city = city;
        this.gender = gender;
        this.phone = phone;
        this.dateBirth = dateBirth;
    }
    //methods getters and setters
    public String getDateInclusion() {
        return dateInclusion;
    }

    public void setDateInclusion(String dateInclusion) {
        this.dateInclusion = dateInclusion;
    }

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }
}
