//Write a Java method to find the smallest number among three numbers.
/*Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:The smallest value is 25 */

public class Functions{
   public int Smaller(int a,int b,int c){
   if(a<b){
	if(a<c)
	{
	   System.out.print(" Smallest value:" +a);
      }

    else{
	System.out.print("c is greater:" +c);
    }
	}
	else if(b<c){
		System.out.print("b is smaller:" +b);
	}
	else{
		System.out.print("c is smaller:" +c);
	
	}

  return 1;
}
  public static void main(String args[] ){
    Functions functions = new Functions();	
     functions.Smaller(25,37,29);
  }
}
