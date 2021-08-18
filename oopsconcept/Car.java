package oopsconcept;

public class Car {
int speed;
String carOwner,carType;
static int counter=0;
	public Car(int speed,String carOwner,String carType) {
		// TODO Auto-generated constructor stub
		this.speed=speed;
		this.carOwner=carOwner;
		this.carType=carType;
		counter++;
	}
	static int getNumberOfSoldCar()
	{
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  		Car c1=new Car(110,"Asih","suv");
  		Car c2=new Car(110,"Asih","suv");
  		Car c3=new Car(110,"Asih","suv");
  		Car c4=new Car(110,"Asih","suv");
  		int noOfSoldCar=getNumberOfSoldCar();
  		System.out.println(counter);
	}

}
