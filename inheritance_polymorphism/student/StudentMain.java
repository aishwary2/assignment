package inheritance_polymorphism.student;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student("S1",23,"Aishwar");
Student s2=new Student("S2",23,"Aishwar");
Student s3=new Student("S3",23,"Aishwar");
Student s4=new Student("S4",23,"Aishwar");
Student s5=new Student("S5",23,"Aishwar");
Student s6=new Student("S6",23,"Aishwar");
Student s7=new Student("S7",23,"Aishwar");
Student s8=new Student();
Student s9=new Student();
Student s10=new Student("S10",23,"Aishwar");
s8.setInfo("New Name", 20);
s9.setInfo("name", 10, "aggsadsa");
for(int i=0;i<Student.student.length;i++) {
	if(Student.student[i]!=null)
	Student.student[i].getInfo();
}
	}

}
