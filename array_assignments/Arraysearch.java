package array_assignments;

import java.util.Scanner;

public class Arraysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,11,12,13,14,15,16,17,18,19,20};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no to be searched");
		boolean check=false;
		int num=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
			check=true;
			}
		}
if(check) {
	System.out.println("Nuber Was found");
}else {
	System.out.println("Number Was not found");
}
	
	}

}
