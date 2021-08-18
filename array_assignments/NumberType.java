package array_assignments;

import java.util.Scanner;

public class NumberType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[20];
		int positive=0,negative=0,odd=0,even=0;
		System.out.println("Enter 20 Integer");
		for(int i=0;i<20;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<20;i++) {
			if(arr[i]>=0) {
				positive++;
			}
			if(arr[i]<0)
				negative++;
			else {
			if(arr[i]%2==0)
				even++;
			else
				odd++;
		}
		}
		System.out.println(positive+" positive no's , "+negative+" negative no's , "+odd+" odd no's , "+even+" even no's ");

	}

}
