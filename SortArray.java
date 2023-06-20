/*1. Sort the array in ascending and descending Order
Test Case 1 -
Enter the size of array 
5
Enter the element
1
Enter the element
13
Enter the element
5
Enter the element
78
Enter the element
43
Enter the order in which you want to sort the array 1 - ascending 2 - descending1
Sorted array is 
1 5 13 43 78


Test Case 2 -Enter the size of array 
4
Enter the element
31
Enter the element
3
Enter the element
54
Enter the element
8
Enter the order in which you want to sort the array 1 - ascending 2 - descending2
Sorted array is 
54 31 8 3 */


import java.util.Scanner;
public class SortArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		int i,j,temp;
		int choice;
		//int cases;
		System.out.println("Enter the size of array:");
		n = sc.nextInt();
		int[] arr = new int[n];
		for( i=0;i<n;i++){
		System.out.println("Enter the element:");
		arr[i] = sc.nextInt();
		}
		

		System.out.println("Enter the order in which you want to sort the array 1 - ascending 2 - descending1");
		choice= sc.nextInt();
		if(choice==1){
					for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
			System.out.println("Array in increasing order:");
		for(j=0;j<n;j++){
			
			System.out.println(arr[j]);
		}
		
		}
		else{
		
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Array in decreasing order:");
		for(j=0;j<n;j++){
			System.out.println(arr[j]);
		}
		}
		
	}
		
}
	