package com.bridgelabz.workshop;

public class SquareOfNumber {
	
	static int getSquare(int number) {
		
		return number *number;
	}
	
	public static void main(String[] args) {
	
		int array[] = { 2,5,3,7,9};
		
		System.out.println("Square of elements in the given array: ");
		
		for(int i = 0; i < array.length ; i++) {
			System.out.println(getSquare(array[i]));
		}
		
		}
}
