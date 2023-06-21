import java.util.Locale;
import java.util.Scanner;

public class Aplication9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name:....");
        String name = scanner.nextLine();
        System.out.print("Price:...");
        double price = scanner.nextDouble();
        System.out.print("Quant:...");
        int quantity = scanner.nextInt();

        Product9 product = new Product9(name, price, quantity);

        System.out.println("Total value in stock: $ " + product.totalValueInStock());
        product.add(5);
        product.remove(2);
        System.out.println("Product price: $ " + product.getPrice());

        System.out.println(product);
        scanner.close();
    }
}
