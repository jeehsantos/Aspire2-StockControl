
package product;

/**
 *
 * @author Jefferson Santos
 */
public class Products {
    String itemCode;
    String type;

    public Products(String itemCode, String type) {
        this.itemCode = itemCode;
        this.type = type;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
