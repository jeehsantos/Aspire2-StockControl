/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author Jefferson Santos
 */
public class Clothes extends Products {

    private String colour, description, brand, size;
    private int quantity;

    public static String LIST = "SELECT * FROM products";
    public static String DELETE = "SELECT * FROM `products` WHERE `?`  LIKE ?";
    public static String REGISTER = "INSERT INTO products("
            + "itemCod,"
            + "itemType,"
            + "itemBrand,"
            + "itemSize,"
            + "itemColour)"
            + "itemDescription)"
            + "itemPrice)"
            + "itemPromo)"
            + "itemQuantity)"
            + "VALUES(?,?,?,?,?)";

    public Clothes() {
        super();
        this.itemCode = "";
        this.type = "";
        this.colour = "";
        this.description = "";
        this.brand = "";
        this.size = "";
        this.price = 00.00;
        this.quantity = 0;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    //If some promotion available, the percentage is going to be inserted by the user and the price will be reduced
    @Override
    public void setPrice(double price) {

        if (promo > 0.0) {
            this.price = price - (price * (promo / 100));
        } else {
            this.price = price;
        }

    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }

}
