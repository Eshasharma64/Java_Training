//Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Base should have properties such as make, model, year, and sub class should have fuel type.


import java.util.Scanner;
public class Vehicle{
	String brand;
	int model_number,year;
	Scanner sc = new Scanner(System.in);
	public void getInfo()
	{
	System.out.println("Enter Brand Name:");
	brand=sc.nextLine();
    System.out.println("Enter Model Number:");
	model_number = sc.nextInt();
	System.out.println("Enter Year:");
	year= sc.nextInt();
	}

}
