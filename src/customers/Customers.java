package customers;

import inventoryclass.login.Person;

/**
 *
 * @author Jefferson Santos
 */
public class Customers extends Person {

    String gender,dateBirth;
   
    //Constructor
    public Customers() {
        this.name = name;
        this.email = email;
        this.city = city;
        this.gender = gender;
        this.phone = phone;
        this.dateBirth = dateBirth;
        this.dateInclusion = dateInclusion;
    }
    //methods getters and setters
   

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

   
    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }
}
