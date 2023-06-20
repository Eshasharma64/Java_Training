/* Create a class named Employee with following data members
first name
last name
bonus 
base salary
Ask the user the count of employee they want to enter and create array of employee objects. In this save values and calculate the salary as per the month entered by the user.*/

import java.util.Scanner;
public class Employees{
	String First_Name;
	String Last_Name;
	int bonus,base_salary,n;
	public void getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee First Name:");
		First_Name=sc.nextLine();
		System.out.println("Enter the Employee Last Name:");
		Last_Name=sc.nextLine();
		System.out.println("Enter the Bonus of Employee:");
		bonus=sc.nextInt();
		System.out.println("Enter the Employee Base Salary:");
		base_salary=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Employee First Name = " + First_Name);
		System.out.println("Employee Last Name = " + Last_Name);
		System.out.println("Employee bonus = " + bonus);
		System.out.println("Employee base salary = " + base_salary);
	}
	public static void main(String[] args) {
		System.out.println("How much employees you want to entered:");
		n=sc.nextInt();
 
	int[] employees = new int[n];
  
	for(int i=0; i<n; i++) {
   
	employees[i].getInput();
	
	}
  
	System.out.println("Data entered as below:");
  
	for(int i=0; i<n; i++) {
   
	employees.display();
  }
 }

		
	
	
}
