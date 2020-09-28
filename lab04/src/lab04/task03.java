package lab04;

import java.util.Scanner;

public class task03 {

	public static void main(String[] args) {
		
		float percentage;
		int noOfClasses= 50;
		
		 Scanner scan =new Scanner(System.in);
		 System.out.println("Total number of classes are: " +noOfClasses);
		 System.out.println("\nNo of classes attend: ");
		 
		 int x =scan.nextInt();
		 
		
		 percentage=((x*100)/noOfClasses);
		 
	     System.out.println("your percentage is: " +percentage);
	     
		if(percentage>=75)
			
		System.out.println("\nYou are eligible for exam");
		else 
		System.out.println("\nYou are not eligible for exam");
	
		
		
	}
}
