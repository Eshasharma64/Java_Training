public class Inheritance{
	public static void main(String args[]){
		Vehicle vehicle=new Vehicle();
		vehicle.getInfo();
		Truck truck = new Truck();
		truck.fuelType();
		Car car=new Car();
		car.fuelType();
		MotorCycle motorcycle= new MotorCycle();
		motorcycle.fuelType();
	}
}
