public class BankClient {
  public static void main(String [] args) {

    BankAccount savings = new BankAccount("Savings", "US", 10000);

    savings.withdrawl(272.50);
    savings.deposit(750);
  }
}
