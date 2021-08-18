package multi_threading;
class  Printer{
	public synchronized void printDocuments(int noOfCopies,String fileName) throws InterruptedException {
		for(int i=1;i<=noOfCopies;i++) {
			//Thread.sleep(300);
		System.out.println("PRINTING \t"+fileName +" "+i);
		}
	}
}
class Mythread extends Thread{
	Printer print=new Printer();
	Mythread(Printer p){
		print =p;
	}
	public void run() {
		try {
			print.printDocuments(10, "AishwaryDocs.pdf");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Yourthread extends Thread{
	Printer print=new Printer();
	Yourthread(Printer p){
		print =p;
	}
	public void run() {
		try {
			print.printDocuments(10, "NotAishwaryDocs.pdf");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class ThreadingByExtend extends Thread {


	public static void main(String[] args) {
		System.out.println("Program Started"+Thread.activeCount());
		Printer p=new Printer();
	Mythread m=new Mythread(p);
	Yourthread y=new Yourthread(p);
	m.start();
//	try {
//		m.interrupt();
//	} catch (Exception e) {
//		System.out.println("thread of Mythread class intrupted");
//	}
	y.start();
//	try {
//		y.join();//Wait for the current thread to die
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	
	
		System.out.println("Program finished");
	}

}
