package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {

		int[] intArray = new int[5]; 
		
		intArray[3] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i=0; i<intArray.length; i++) { //0부터 시작이므로 intArray 미만의 반복횟수를 가져야 함
			result = result+intArray[i];
		}
		System.out.println(result);
	}

}
