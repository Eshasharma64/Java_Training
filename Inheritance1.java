/*Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class".
 Now, create an object for each of the class and call
1 -method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class */


class ParentClass{
	String parent = "This is parent class";
	public void getInfo()
	{
		System.out.println(parent);
	}
}

class ChildClass extends ParentClass{
	String child = "This is child class";
	public void getValue()
	{
		System.out.println(child);
	}
}

//public class Inheritance1{
	public static void main(String args[]){
		ParentClass parentclass = new ParentClass();
		parentclass.getInfo();
		ChildClass childclass = new ChildClass();
		childclass.getValue();
		childclass.getInfo();
		
	}
//}

	
