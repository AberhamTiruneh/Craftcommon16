package com.day6.array;

public class ArrayDemo7 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			double studsMark[][] = {
		               {85,78,90,75,97,67,80,70,50,89}, 
		               {85,78,90,75,97,67,80,60,50,87},
		               {85,78,98,75,70,80,89,58,76,86},
		               {85,78,90,75,97,67,80,70,60,89},
		               {85,78,90,79,97,69,88,79,90,84},
	                
	                };
			for (int i = 0; i < studsMark.length; i++) {
				double avg =0;
				int sum =0;
			
				


				for (int j = 0; j < studsMark[i].length; j++) {
					System.out.print(studsMark[i][j] + " ");
					sum +=studsMark[i][j];
					avg =sum/studsMark[i].length;
					
					
				}
				System.out.println("sum =" + sum);
				System.out.println("Average =" + avg);
				
				
			
				
				
		}
		}
	}

