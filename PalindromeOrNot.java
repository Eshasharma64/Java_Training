//Write a function to check whether the entered number is palindrome or not?
import java.util.Scanner;
public class PalindromeOrNot {
   public void palindrome( int a){
      int rem=0;
   	int temp=a;
	while(a>0){
   	rem=rem*10 + a%10;
   	a=a/10;
	}
	if(rem==temp){
		System.out.println("The entered number is a palindrome number");
	
	}
	else{
 		System.out.println("The entered number is not a palindrome number");
      }

     
  }


public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the number:");
   int num1=sc.nextInt();
   PalindromeOrNot obj=new PalindromeOrNot();
   obj.palindrome(num1);
}
}
