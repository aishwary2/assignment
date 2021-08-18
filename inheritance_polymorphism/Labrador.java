package inheritance_polymorphism;

public class Labrador extends Dogs{
String name,color;
	public Labrador(String name,String color) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.color=color;
	}
	public int avgBreedWeight() {
		return 40;
	}

}
