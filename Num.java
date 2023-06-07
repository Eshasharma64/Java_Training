import java.util.Scanner;
public class Num{
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a;
    float b;
    double c;
    char d;
    System.out.println("Enter the integer value:");
    a=sc.nextInt();
    System.out.println("Enter the  floating value :");
    b=sc.nextFloat();
    System.out.println("Enter the double value :");
    c=sc.nextDouble();
    System.out.println("Enter the character value :");
    d=sc.next().charAt(0);
    System.out.println("value of a:" +a);
    System.out.println("value of b:" +b);
    System.out.println("value of c:" +c);
    System.out.println("value of d:" +d);
}
}