package inheritance_polymorphism.student;

public class Student {
	String name;
	int age;
	String address;
	static Student student[]=new Student[10];
	static int counter=0;
public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
		student[counter++]=this;
	}

public Student() {
	this.name="unknown";
	this.age=0;
	this.address="not available";
	student[counter++]=this;
}
public void setInfo(String name,int age) {
	this.name=name;
	this.age=age;
}
public void setInfo(String name,int age,String address) {
	this.name=name;
	this.age=age;
	this.address=address;
}
public void getInfo() {
	System.out.println("name: "+name+" age:"+age+" address:"+address);
}
}
