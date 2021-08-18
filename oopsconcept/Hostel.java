package oopsconcept;

public class Hostel {
	int student_id;
	String student_name,student_class;
	static int counter=0;
		public Hostel(int student_id,String student_name,String student_class) {
			// TODO Auto-generated constructor stub
			this.student_id=student_id;
			this.student_name=student_name;
			this.student_class=student_class;
			counter++;
		}
		static int getNumberOfStudent()
		{
			return counter;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	  		Hostel h1=new Hostel(1,"Aish","dgdd");
	  		Hostel h2=new Hostel(1,"Aish","dgdd");
	  		Hostel h3=new Hostel(1,"Aish","dgdd");
	  		int noOfSoldCar=getNumberOfStudent();
	  		System.out.println(counter);
		}
}
