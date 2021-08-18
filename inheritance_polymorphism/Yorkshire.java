package inheritance_polymorphism;

public class Yorkshire extends Dogs {
String name,color;
	public Yorkshire(String name,String color) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.color=color;
	}
	@Override
	public int avgBreedWeight() {
		// TODO Auto-generated method stub
		return 35;
	}
	

}
