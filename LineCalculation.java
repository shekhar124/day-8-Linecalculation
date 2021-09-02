package com.bl.java;

import java.util.Scanner;

public class LineCalculation {

	public static void main(String[] args) {
		System.out.println("WELL COME TO LINE COMPARISON");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of x1");
		double x1 = scan.nextDouble();
		System.out.println("enter the value of x2");
		double x2 = scan.nextDouble();
		System.out.println("enter the value of y1");
		double y1 = scan.nextDouble();
		System.out.println("enter the value of y2");
		double y2 = scan.nextDouble();
		
		
		System.out.println("enter the value of x1");
		double x11 = scan.nextDouble();
		System.out.println("enter the value of x2");
		double x22 = scan.nextDouble();
		System.out.println("enter the value of y1");
		double y11 = scan.nextDouble();
		System.out.println("enter the value of y2");
		double y22 = scan.nextDouble();
		
		
		
		double distance1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		System.out.println("line 1 Length :" +  distance1);
		double distance2 = Math.sqrt((y22 - y11) * (y22 - y11) + (x22 - x11) * (x22 - x11));
		System.out.println("line 1 Length :" +  distance2);
		if(distance1==distance2) {
			System.out.println("both lines are equal");
			
		}else {
			System.out.println("two lines are not equal");
		}

	}

}
