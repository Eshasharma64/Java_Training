//Write a Java method that accepts three integers and checks whether they are consecutive or not. Returns true or false.

import java.util.Scanner;
public class Consecutive_Checker{
	public boolean consec_num(int a , int b , int c){
		if(b==(a+1) && c==(b+1)){
			System.out.print("Entered integers is Consecutive:");
			return true;
		}
		else{
			System.out.print("Entered integers is consecutive:");
			return false;
		}
     }
	public static void main(String args[]){
		int d,e,f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer value:");
		d=sc.nextInt();
		System.out.print("Enter second integer value:");
		e=sc.nextInt();
		System.out.print("Enter third integer value:");
		f=sc.nextInt();
			
		Consecutive_Checker obj = new Consecutive_Checker();
		System.out.println(obj.consec_num(d,e,f));
	}
	
}