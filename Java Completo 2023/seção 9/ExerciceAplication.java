import java.sql.SQLOutput;
import java.util.Scanner;

public class ExerciceAplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account holder: ");
        String name = scanner.nextLine();
        ExerciceAccount account = new ExerciceAccount(accountNumber,name);

        System.out.print("Is there na initial deposit (y/n)?");
        String initialDeposit = scanner.next();
        if ( initialDeposit.equals("y")){
            System.out.print("Enter initial deposit value: ");
            double value = scanner.nextDouble();
            account.deposit(value);
        }

        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double value = scanner.nextDouble();
        account.deposit(value);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        value = scanner.nextDouble();
        account.withdraw(value);
        System.out.println("Updated account data:");
        System.out.println(account);

    }
}
