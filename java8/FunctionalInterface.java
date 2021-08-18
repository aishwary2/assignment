package java8;
//@java.lang.FunctionalInterface
interface Employee{
	//int id=10;
	public void showId();
	//public void showEmp();
//	default void show() {
//		System.out.println("Its the method of interface");
//	}
}
public class FunctionalInterface {
//	public void showId() {
//		System.out.println("here is your id");
//	}
	
	public static void main(String[] args) {
		Employee e=()->{System.out.println("Show method");};
		e.showId();
		// TODO Auto-generated method stub
	//	FunctionalInterface fi=new FunctionalInterface();
		//fi.showId();
		//fi.show();
		//System.out.println(Employee.id);
	//	fi.showEmp();

	}
//	@Override
//	public void showEmp() {
//		// TODO Auto-generated method stub
//		System.out.println("second abstract method");
//		
//	}

	

}
