package accounts;

public class Client {

  private Account[] accounts;
  private int index;

  public Client() {
    accounts = new Account[5];
    index = 0;
  }

  public void addAccount(int accountNumber, int balance) {
    accounts[index++] = new NormalAccount(this, accountNumber);
  }

  public void removeAccount(int accountNumber) {
    // search for account
    accounts[0] = null;
    // check if this is the last open account, then close client
  }

}
