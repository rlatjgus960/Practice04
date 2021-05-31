package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		double[] n = new double[5];
		/*
		n[0] = sc.nextDouble();
		n[1] = sc.nextDouble();
		n[2] = sc.nextDouble();
		n[3] = sc.nextDouble();
		n[4] = sc.nextDouble();
		*/
		double sum = 0;

		for (int i = 0; i<n.length; i++) {
			n[i] = sc.nextDouble();
			sum=sum+n[i];
		}
		
		
		System.out.println(sum/n.length);
		sc.close();

	}

}
