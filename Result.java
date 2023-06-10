//Write a program with a method named getTotal that accepts two integers as an argument and return its sum. Call this method from main( ) and print the results.

import java.util.Scanner;
public class Result{
  public int getTotal(){
 	Scanner sc=new Scanner(System.in);
 	int sum;
  	System.out.print("Enter the value of a:");
   	int a=sc.nextInt();
  	System.out.print("Enter the value of b:");
   	int b=sc.nextInt();
   	sum= a+b;
	System.out.print("Sum of two integers is:" );
  	return sum;

  }


  public static void main(String args[]){
  Result results=new Result();
  System.out.println(results.getTotal());
  }
}
 