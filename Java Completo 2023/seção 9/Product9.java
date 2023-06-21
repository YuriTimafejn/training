public class Product9 {
    private String name;
    private double price;
    private int quantity;

    public Product9() {}
    public Product9(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Product9(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName () {
        return this.name;
    }
    public String getPrice() {
        return String.format("%4.2f", this.price);
    }
    public int getQuantity() {
        return this.quantity;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public double totalValueInStock () {
        return this.price * this.quantity;
    }

    public void add (int newQuantity) {
        this.quantity += newQuantity;
    }

    public void remove (int removedQuantity) {
        this.quantity -= removedQuantity;
    }

    @Override
    public String toString() {
        return this.name + "\n" +
        "Price: $ " + String.format( "%.2f",this.price) + "\n" + "In stock: " + this.quantity + " units\n" +
                "Total in stock: $ " + String.format( "%.2f",totalValueInStock());
    }
}