import java.util.Scanner;
public class Split{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the floating value of a:");
    float a=sc.nextFloat();
    int b= (int) a;
    float c= a-b;
    System.out.println("Integer part:" +b);
    System.out.println("Decimal part:" +c);

  }
}