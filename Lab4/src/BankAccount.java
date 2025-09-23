public class BankAccount {
    double balance;
    public BankAccount()
    {
        balance =1000;
    }
    public BankAccount(double bal)
    {
        balance =bal;
    }
    public void setBalance(double b)
    { balance = b;}
    public void showBalance()
    {
        System.out.println("Balance is "+ balance);
    }
}