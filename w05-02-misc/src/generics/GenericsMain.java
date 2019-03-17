package generics;

public class GenericsMain {

    public static void main(String[] args) {

        Account<EGP> egpAccount = new Account<>(100, new EGP());
        egpAccount.deposit(100);
        egpAccount.deposit(200);
        egpAccount.deposit(2000);

        Account<USD> usdAccount = new Account<>(100, new USD());
        usdAccount.deposit(1000);
        usdAccount.deposit(5000);
        usdAccount.deposit(50000);

        egpAccount.printStatement();
        usdAccount.printStatement();

        Account<EUR> eurAccount = new Account<>(100, new EGP());

    }

}
