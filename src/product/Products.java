
package product;

/**
 *
 * @author Jefferson Santos
 */
public class Products {
    protected String itemCode;
    protected String type;
    private int idSale;
    protected double price, promo;

     
    public static String LIST = "SELECT * FROM products";
    
    
    public Products() {
        this.itemCode = itemCode;
        this.type = type;
        this.idSale = idSale;
        this.price = price;
        this.promo = promo;
    }
    
    public int getIdSale() {
        return this.idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }
    
     public double getPromo() {
        return this.promo;
    }

    public void setPromo(double promo) {
        this.promo = promo;
    }
    public Double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
            this.price = price;
    }
    
    public String getCode() {
        return this.itemCode;
    }

    public void setCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

}
