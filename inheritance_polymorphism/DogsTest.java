package inheritance_polymorphism;

public class DogsTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Labrador l= new Labrador("asih","black");
    		System.out.println("Name of Labrador is :"+l.name+" Color: "+l.color+"Average Laboror Weight is :"+l.avgBreedWeight());
	Yorkshire y=new Yorkshire("ashi","white");
	System.out.println("Name of Yorkshire is :"+y.name+" Color: "+y.color+"Average Yorkshire Weight is :"+y.avgBreedWeight());
	}

}
