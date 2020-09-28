package lab04;

import java.util.Scanner;

public class task02 {

	public static void main(String[] args) {
		
		int math,english,urdu,oop,algebra;
		float marks,sum;
		int totalMarks= 500;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your subejct marks: ");
		
		System.out.println("\nEnter your first subejct marks: ");
		math =scan.nextInt();
		System.out.println("\nEnter your second subejct marks: ");
		english = scan.nextInt();
		System.out.println("\nEnter your third subejct marks: ");
		urdu = scan.nextInt();
		System.out.println("\nEnter your fourth subejct marks: ");
		oop = scan.nextInt();
		System.out.println("\nEnter your fifth subejct marks: ");
		algebra = scan.nextInt();
	
		sum = math +english +urdu + oop +algebra;
		System.out.println("\nYour total marks is: " +sum);
		marks = (sum/totalMarks)*100;
		System.out.println("\nYour percentage is: " +marks);
		
		if(marks<25) {
			System.out.println("\nYour grade is: F");
		}
		else if(marks >= 25 && marks < 45) {
			System.out.println("\nYour grade is: E");
		}
		
		else if(marks >= 45 && marks < 50) {
			System.out.println("\nYour grade is: D");
		}
		
		else if(marks >= 50 && marks < 60) {
			System.out.println("\nYour grade is: C");
		}
		
		else if(marks >= 60 && marks < 80) {
			System.out.println("\nYour grade is: B");
		}
		else if(marks >=80 && marks <=100) {
			System.out.println("\nYour grade is: A");
		}
	}

}
