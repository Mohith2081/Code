package com.demotraining;

import java.util.Scanner;

public class UserInput {

	public float[] distanceAndTime(int n) {
		Scanner userIn=new Scanner(System.in);
		System.out.println("Enter user "+(n)+" Distance:");
		float distance=userIn.nextFloat();
		
		System.out.println("Enter user "+(n)+" Time:");
		float time=userIn.nextFloat();
		float enteredData[]= {distance,time};
		System.out.println("===============");
		
		return enteredData;
	}
}
