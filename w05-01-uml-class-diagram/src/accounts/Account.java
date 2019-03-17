package accounts;

public abstract class Account {

  protected Client owner;
  protected int accountNumber;
  protected int balance;

  public Account(Client owner, int accountNumbers) {
    this.owner = owner;
    this.accountNumber = accountNumbers;
  }

  public Client getOwner() {
    return owner;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

}
