public class ExerciceAccount {
    private final String accountNumber;
    private String accountClient;
    private double balance = 0;

    public ExerciceAccount(String account, String name) {
        this.accountNumber = account;
        this.accountClient = name;
    }

    public String getAccountClient() {
        return this.accountClient;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getBalance() {
        return String.format("%6.2f", balance);
    }

    public void setAccountClient(String name) {
        this.accountClient = name;
    }

    public void deposit(double value) {
        if (negativeValueDeposit(value)) {
            throw new RuntimeException("The deposit value needs to be positive");
        }

        this.balance += value;
    }

    public void withdraw(double value) {
        if (verifyBalanceWithdraw(value + ExerciceAccountTax.withdrawalTax())) {
            throw new RuntimeException("You don't have this value to take");
        }

        this.balance -= value + ExerciceAccountTax.withdrawalTax();
    }

    @Override
    public String toString() {
        return "Account n° " + accountNumber +
                "\nHolder: " + accountClient +
                "\nBalance: $ " + this.getBalance();
    }

    private boolean negativeValueDeposit(double value) {
        return value <= 0;
    }

    private boolean verifyBalanceWithdraw(double value) {
        return balance < value;
    }
}
