package com.practice;
import java.time.*;
import java.util.Arrays;
public class Jointhread implements Runnable {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String ThreadName=Thread.currentThread().getName();
		System.out.println(ThreadName+"---------Starting------");
		for(int i=0;i<10;i++) {
			System.out.println(ThreadName+"  "+i);
		}
		try {
			Thread.sleep(200);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(ThreadName +"--------Ending------");
	}
	public static void main(String[] args) {
		Jointhread target=new Jointhread();
		Thread t1=new Thread(target);
		Thread t2=new Thread(target);
		Thread t3=new Thread(target);
		t1.setName("pankaj");
		t2.setName("rajeev");
		t1.start();
		try {
			t1.join(30000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		t2.start();
		}


}
