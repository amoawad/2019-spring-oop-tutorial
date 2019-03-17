package bank;

public class Employee implements ITeller {

  @Override
  public int withdraw(int amount) {
    // take client national ID
    copyID("client ID");
    // check balance
    // handout money
    return 0;
  }

  private void copyID(String clientId) {
    Printer printer = new Printer();
    printer.print(clientId);
  }

  @Override
  public void deposit(int amount) {

  }
}
