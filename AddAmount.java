/*Suppose you have a Piggie Bank with an initial amount of $50 and you have to addsome more amount to it. Create a class AddAmount with a data member named
amount with an initial value of $50. Now make two constructors of this class as
follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to the Piggie Bank
Create an object of the  AddAmount class and display the final amount in the Piggie Bank.
3 - Repeat the addition in balance till 0 or negative value is entered*/



public class AddAmount{
	private int amount = 50;
	AddAmount()
	{
		System.out.println("Initial Amount:"+amount);
	}
	AddAmount(int a)
	{
		this.amount = amount + a;
		System.out.println("Final amount:" +amount);
	}
	public static void main(String args[]){
		AddAmount addamount = new AddAmount();
		AddAmount addamount1 = new AddAmount(90);
	}
}
		
