/* Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. 
The bank should have a list of accounts and methods for adding them. 
Accounts should be an interface with methods to deposit, withdraw, calculate interest, 
and view balances. SavingsAccount and CurrentAccount 
should implement the Account interface 
and have their own unique methods.*/
import java.util.Scanner;
interface Account{
	void deposit();
	void withdraw();
	void Interest();
	void Balance();
}
		

class SavingAccount implements Account{
	float depo,draw;
Scanner sc = new Scanner(System.in);
	public void deposit()
	{
		System.out.println("Enter the amount you want to deposit in saving account:");
		 depo = sc.nextFloat();
	}
	public void withdraw()
	{
		System.out.println("Enter the amount you want to withdraw:");
		 draw = sc.nextFloat();
	}
	public void Balance()
	{

		float balance = (depo-draw);
		System.out.println("Balance of Saving account:" +balance);
	}
	public void Interest()
	{
		System.out.println("Enter the rate of interest:");
		float interest = sc.nextFloat();
		System.out.println("Enter the year:");
		float year = sc.nextFloat();
		System.out.println("Enter the amount:");
		float amt = sc.nextFloat();
		float CalculatedInterest = interest*year*amt;
		System.out.println("Calculated Interest of Saving Account:" +CalculatedInterest);
	}
	
}
 class CurrentAccount implements Account{
	 float current,draw;
	 Scanner sc = new Scanner(System.in);
	public void deposit()
	{
		System.out.println("Enter the you want to deposit in current account:");
		 current = sc.nextFloat();
	}
	public void withdraw()
	{
		System.out.println("Enter the amount you want to withdraw:");
		draw = sc.nextFloat();
	}
		public void Balance()
	{ 

		float balance = (current-draw);
		System.out.println("Balance of Current account:" +balance);
	}
	public void Interest()
	{
		System.out.println("Enter the rate of interest:");
		float interest = sc.nextFloat();
		System.out.println("Enter the year:");
		float year = sc.nextFloat();
		System.out.println("Enter the amount:");
		float amt = sc.nextFloat();
		float CalculatedInterest = interest*year*amt;
		System.out.println("Calculated Interest of Current Account:" +CalculatedInterest);
	}

}
public class Bankaccount{
public static void main(String args[]){
	SavingAccount acc1 = new SavingAccount();
	
	acc1.deposit();
	acc1.withdraw();
	acc1.Balance();
	acc1.Interest();
	CurrentAccount acc2 = new CurrentAccount();
	acc2.deposit();
	acc2.withdraw();
	acc2.Balance();
	acc2.Interest();
}
}
	
	