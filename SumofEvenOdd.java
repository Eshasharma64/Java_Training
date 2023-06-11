//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
/*Test case
How many numbers you want to enter - 5
Enter number at 1 position - 2
Enter number at 2 position - 3
Enter number at 3 position - 1
Enter number at 4 position - 4
Enter number at 5 position - 8
Sum of even number is 14
Sum of odd number is 4 */

import java.util.Scanner;
public class SumofEvenOdd{
	public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
        int n;
	  int evensum = 0;
	  int oddsum = 0;
	  System.out.print("How many numbers you want to enter:");
	  n = sc.nextInt();
        int[] arr = new int[n];
	  for(int i=0;i<n;i++){
		System.out.print("Enter number at  position:" );
		arr[i] = sc.nextInt();
		if(arr[i] % 2 == 0){
			evensum = evensum + arr[i];
		}
		else{
			oddsum = oddsum + arr[i];
		}

	  }
	  System.out.println("Sum of even numbers:" +evensum);
	  System.out.println("Sum of odd numbers:" +oddsum);

        

}
}
	  