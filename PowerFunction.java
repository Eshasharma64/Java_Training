/* Write a function to calculate the power of a functions
Test Case
Enter the base number 2
Enter the exponent number 3
Result is 8
Test Case 2
Enter base number 3
Enter the exponent number 5
Result is 243 */

import java.util.Scanner;
import java.lang.Math;
public class PowerFunction{
	public static double power(double a , double b){
		System.out.print("Result is:");
		return(Math.pow(a,b));
	  	
	
	}
	public static void main(String args[]){
		double num1 , num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base number:");
		num1 = sc.nextDouble();
		System.out.println("Enter the exponent number:");
	 	num2 = sc.nextDouble();

		PowerFunction obj = new PowerFunction();
		System.out.println(obj.power(num1 , num2));

	}
}