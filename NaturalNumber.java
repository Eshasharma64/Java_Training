//Write a program to calculate the sum of first 10 natural number.
import java.util.Scanner;
public class NaturalNumber {
	public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 int n;
	 int sum =0;
	 System.out.print("Enter the number:");
	 n=sc.nextInt();
	 for(int i=1;i<=n;i++){
 	   sum=i+sum;
 	 }
	  System.out.println("Sum of first" + n + " natural number:" +sum);

 	}
} 