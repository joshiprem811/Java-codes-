class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String name, double initialBalance) {
        this.accountHolder = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited.");
            System.out.println("Current Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (balance - amount < 100) {
            System.out.println("Transaction failed! Balance cannot go below ₹100.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn.");
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {

    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
    }
}
class BankSystem {
    public static void main(String[] args) {
        SavingsAccount user1 = new SavingsAccount("Roshan", 1000);

        user1.checkBalance();
        user1.deposit(500);
        user1.withdraw(1300);
        user1.withdraw(900);
        user1.checkBalance();
    }
}
