package product;

public class productItem {

    String itemCod, itemType, itemBrand, itemSize, itemColour, itemDescription;
    double itemPrice, itemPromo;
    int itemQuantity;

    //Class constructor
    productItem() {
        this.setItemCod(itemCod);
        this.setItemType(itemType);
        this.setItemBrand(itemBrand);
        this.setItemSize(itemSize);
        this.setItemColour(itemColour);
        this.setItemPrice(itemPrice);
        this.setItemPromo(itemPromo);
        this.setItemDescription(itemDescription);
        this.setItemQuantity(itemQuantity);
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    //Methods getters and setters
    public String getItemCod() {
        return itemCod;
    }

    public void setItemCod(String itemCod) {
        this.itemCod = itemCod;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public String getItemSize() {
        return itemSize;
    }

    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
    }

    public String getItemColour() {
        return itemColour;
    }

    public void setItemColour(String itemColour) {
        this.itemColour = itemColour;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    //If some promotion available, the percentage is going to be inserted by the user and the price will be reduced
    void setItemPrice(double itemPrice) {
        getItemPromo();
        if (itemPromo > 0.0) {
            this.itemPrice = itemPrice * (itemPromo / 100);
        } else {
            this.itemPrice = itemPrice;
        }

    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getItemPromo() {

        return this.itemPromo;
    }

    public void setItemPromo(double itemPromo) {
        this.itemPromo = itemPromo;
    }
}
