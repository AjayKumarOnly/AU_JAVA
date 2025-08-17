class BankAccount {
    private static int totalAccounts = 0;
    private int accountNumber;
    private int balance;

    public BankAccount(int accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        totalAccounts++;
    }

    public void deposit(int amount) {
        int depositAmount = amount;
        balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made to account " + accountNumber);
        System.out.println("Updated balance: " + balance);
    }

    public void showAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static void showTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        System.out.println("Name : S. Ajay Kumar");
        System.out.println("Roll No : 2024503701");
        BankAccount acc1 = new BankAccount(1001, 500);
        BankAccount acc2 = new BankAccount(1002, 1000);

        acc1.deposit(200);
        acc2.deposit(300);

        System.out.println();
        acc1.showAccountDetails();
        acc2.showAccountDetails();

        BankAccount.showTotalAccounts();
    }
}
