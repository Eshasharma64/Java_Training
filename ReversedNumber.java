// Write a program to reverse a number and find the average of reversed number.
import java.util.Scanner;
public class ReversedNumber{
	public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 int n ;
	 int reverse=0;
	 int sum = 0;
	 int num , avg;
	 System.out.print("Enter the number:");
  	 
	 for(n=sc.nextInt() ; n!=0 ; n/=10 ){
	 
	 int remainder=n % 10;
	 sum = (sum + remainder);
	 reverse = reverse * 10 + remainder;
	 
	 }
	 System.out.print("Total numbers that you entered:");
	 num = sc.nextInt();
	 avg = sum / num;
	 System.out.println("Reversed number:"+reverse );
	 System.out.println("Sum of given number entered by user:" +sum);
	 System.out.println("Average of reversed number:" +avg);
 	}
}
	 