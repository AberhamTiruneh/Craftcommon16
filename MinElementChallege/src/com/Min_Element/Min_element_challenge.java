package com.Min_Element;

import java.util.Scanner;

public class Min_element_challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner in = new Scanner(System.in);

// get array size from keyboard
		System.out.println("Please enter array size");
		int count = in.nextInt();

// methods called here
		int sendNum[] = readInteger(count);
		System.out.print("The minimum number is: ");
		System.out.println(findMini(sendNum));

	}

// accepting integers from the keyboard
	public static int[] readInteger(int count) {
		Scanner in = new Scanner(System.in);

		int[] getNum = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.println("Enter element on index: "+ i);
			getNum[i] = in.nextInt();

		}
		return getNum;
	}

// this method finds minimum integer number from the array
	public static int findMini(int[] mini) {

		int min = mini[0];

		for (int i = 1; i < mini.length; i++) {

			if (mini[i] < min) {

				min = mini[i];
			}
		}
		return min;

	}		
		
	}

