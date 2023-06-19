/* Create a class named Rectangle with two data members- length and breadth and a
function to calculate the area which is length*breadth. The class has three
constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and
breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that
number.
Now, create objects of the Rectangle class having none, one and two parameters
and print their areas.*/

public class Rectangles{
	Rectangles(){
		int length=0;
		int breadth=0;
		int area= length*breadth;
		System.out.println("Arae of rectnagle:" +area);
	}
	Rectangles(int a,int b){
		int length = a;
		int breadth = b;
		int area = length*breadth;
		System.out.println("Area of reactangle is :" +area);
	}
	Rectangles(int a){
	
		int length = a;
		int area = length*length;
		System.out.println("Area of rectangle by passing one argument:" +area);
	}
	
		
	public static void main(String args[]){
		Rectangles rectangle = new Rectangles();
		Rectangles rectangle1 = new Rectangles(2,3);
		Rectangles rectangle2 = new Rectangles(2);
		
	}
}
