package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] no = new int[6];
				
		for (int i=0; i<no.length; i++) {
			no[i] = (int)(Math.random()*45)+1;
			while(i>0 && no[i]==no[i-1]) {
				no[i] = (int)(Math.random()*45)+1;
			}
			System.out.print(no[i]+" ");
			
			
		}
			
			
			
		
		
		
	}

}

