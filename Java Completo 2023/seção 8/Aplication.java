import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name:....");
        product.name = scanner.nextLine();
        System.out.print("Price:...");
        product.price = scanner.nextDouble();
        System.out.print("Quant:...");
        product.quantity = scanner.nextInt();

        System.out.println("Total value in stock: $ " + product.totalValueInStock());
        product.add(5);
        product.remove(2);

        System.out.println(product);
        scanner.close();
    }
}
