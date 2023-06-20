/*. A person landed in a country where he has no idea of the currency notes. He asked the locals about the notes available in the country and he had to pay in a shop.
 Given an amount, find the minimum number of notes of different denominations that sum up to the given amount.
Starting from the highest denomination note, try to accommodate as many notes as possible for a given amount.*/


import java.util.Scanner;
public class Amount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of currency denominations :");
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		System.out.println("Enter the currency denomination:");
		arr[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to print:");
		int amt = sc.nextInt();
		System.out.println("Your payment approach in order to give min no of notes will be:");
		while(amt>0){
			
			for(int i =0;i<n;i++){
				int notes = amt/arr[i];
				amt = amt-(arr[i]*notes);
				
				System.out.println(arr[i]+":"+ notes);
			}
		}
	}
}