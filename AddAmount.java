/*Suppose you have a Piggie Bank with an initial amount of $50 and you have to addsome more amount to it. Create a class AddAmount with a data member named
amount with an initial value of $50. Now make two constructors of this class as
follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to the Piggie Bank
Create an object of the  AddAmount class and display the final amount in the Piggie Bank.
3 - Repeat the addition in balance till 0 or negative value is entered*/



 
import java.util.Scanner;
public class AddAmount{
	static int amount = 50;
	AddAmount()
	{
		int sum=0;
		amount=amount+sum;
		System.out.println("Balance in your piggie bank::" +amount);
	}
	AddAmount(int sum){
		amount = amount + sum;
		System.out.println("Balance in your piggie bank::" +amount);
	}
	
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		int amt;
		
		do{
			System.out.println("Enter the amount you want to enter:" );
			amt=s.nextInt();
			if(amt>0){
				AddAmount obj = new AddAmount(amt);
				amt=amt+amount; 
			}
			else{
				System.out.println("Your final balance is:" +amount);
			}
		}while(amt!=0);
		
		
	}
}