public class BankAccount {

    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
