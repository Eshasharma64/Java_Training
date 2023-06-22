/* We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects
 (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
 It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students.
 The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
 Create an object for each of the two classes and print the percentage of marks for both the students.*/
 
 
abstract class Marks{
	public abstract float getPercentage();
}
class A extends Marks{
	 float english,maths,science;
	 A(float eng,float math,float sci)
	{
			english = eng;
			maths = math;
			science = sci;
			
	}
	public float getPercentage()
	{
		return((english+maths+science)/300)*100;
	}
	
}
class B extends Marks{
	 float english,maths,science,social;
	B(float eng,float math,float sci,float soc)
	{
		english = eng;
		maths = math;
		science = sci;
		social = soc;
	}
	public float getPercentage(){
		return((english+maths+science+social)/400)*100;
	}
}
public class TotalMarks{
	public static void main(String args[]){
		A a = new A(75,85,90);
		B b = new B(90,70,80,70);
		System.out.println("Percentage of student A:" +a.getPercentage());
		System.out.println("Percentage of student B:" +b.getPercentage());
	}
}

