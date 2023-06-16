
import java.util.Scanner;
public class Employee extends Person{
	Scanner sc=new Scanner(System.in);
	public void getEmployeeId(){
		System.out.println("Enter the EmployeeId:");
		int EmployeeId=sc.nextInt();
	}



public static void main(String args[]){
	Employee obj = new Employee();
        obj.getFirstName();
	obj.getLastName();
	obj.getEmployeeId();
	

}
}
