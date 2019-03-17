package generics;

public class Account<T> {

    T currency;
    int balance;

    public Account(int initialBalance, T currency) {
        this.balance = initialBalance;
        this.currency = currency;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void printStatement() {
        System.out.println("Balance = " + balance + " " + currency);
    }

}
