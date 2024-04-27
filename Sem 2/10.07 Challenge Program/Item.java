// Gavin Perry, 2024-4-14, The purpose of this program is to define an item class that stores information about a product.
public class Item {
    private String name;
    private double price;
    private int quantity;
    private int productNumber;

    public Item(String name, double price, int quantity, int productNumber) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.productNumber = productNumber;
    }

    public String toString() {
        return String.format("Product Number: %d\nName: %s\nPrice: $%.2f\nQuantity: %d\n", productNumber, name, price, quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

}
