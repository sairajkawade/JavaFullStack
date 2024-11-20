package com.velocity;

import java.util.Scanner;

public class AdditionOfNumebrs {

	public int getAddition() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many number's addition you want >>");
		int  numbers= scanner.nextInt();
		int no, result=0 ; 
		for(int i = 1 ; i <= numbers ; i++) {
			System.out.print("Enter the "+i+" number >> ");
			no = scanner.nextInt();
			result = result + no ;
		}
		System.out.println("\nAddition is >> "+result);
		return result;
	}
	
	public static void main(String[] args) {
	
		AdditionOfNumebrs addition = new AdditionOfNumebrs();
		addition.getAddition();
	}

	

}
