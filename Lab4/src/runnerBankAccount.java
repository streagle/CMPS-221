import java.util.Scanner;
public class runnerBankAccount {
    public static void main(String[] args)
    {
        BankAccount act1= new BankAccount ();
        Scanner input =new Scanner(System.in);
        System.out.println("Enter balance amount");
        double balance = input.nextDouble();
        BankAccount act2= new BankAccount (balance);
        act1.showBalance();
        act2.showBalance();
        act1.setBalance(2500);
        act1.showBalance();
        act2.setBalance(3500);
        act2.showBalance();
    }
}