/*Create a class named 'Shape' with a method to print "This is This is shape". 
Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" 
and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle".
 Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.*/
 
 
 class Shape{
	 public void getInfo()
	 {
		 String shape1="This is shape";
		 System.out.println(shape1);
	 }
 }
 class Rectangle extends Shape{
	 public void getValue()
	 {
		 String shape2 = "This is rectangular shape";
		 System.out.println(shape2);
	 }
 }
 class Circle extends Shape{
	 public void getcircle()
	 {
		 String shape3 = "This is circular shape";
		 System.out.println(shape3);
	 }
 }
 class Square extends Rectangle{
	 public void getsquare()
	 {	
		 String shape4 = "Square is rectangle";
		 System.out.println(shape4);
		  
	 }
 }
 public class Inheritance2{
	 public static void main(String args[]){
		 Square square = new Square();
		 square.getValue();
		 square.getInfo();
	 }
 }