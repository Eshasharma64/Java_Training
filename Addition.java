import java.util.Scanner;
public class Addition{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    float a,b,c;
    System.out.println("Enter the first floating value:");
    a=sc.nextFloat();
    System.out.println("Enter the second floating value:");
    b=sc.nextFloat();
    System.out.println("Enter the third floating value:");
    c=sc.nextFloat();
    int d=(int) ( a + b + c);
    System.out.println("Integer value:" +d);
    double e= (double) ( a + b + c);
    System.out.println("Double value:" +e);

    





  }
}