public class Product8 {
    public String name;
    public double price;
    public int quantity;

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