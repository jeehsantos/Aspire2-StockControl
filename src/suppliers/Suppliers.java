package suppliers;

import inventoryclass.login.Person;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jefferson Santos
 */
public class Suppliers extends Person {
    String nickName, address, postcode, product;
    Date date = Calendar.getInstance().getTime();
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    String strDate = dateFormat.format(date);
    public Suppliers() {
        Date data = new Date(System.currentTimeMillis());
        dateInclusion = strDate;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

   

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    
}
