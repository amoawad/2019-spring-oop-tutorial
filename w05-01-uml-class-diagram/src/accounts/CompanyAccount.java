package accounts;

public class CompanyAccount extends Account {

  private int registrationNumber;
  private String deputy;

  public CompanyAccount(Client owner, int accountNumbers) {
    super(owner, accountNumbers);
  }

  public int getRegistrationNumber() {
    return registrationNumber;
  }

  public String getDeputy() {
    return deputy;
  }

  public void setRegistrationNumber(int registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public void setDeputy(String deputy) {
    this.deputy = deputy;
  }
}
