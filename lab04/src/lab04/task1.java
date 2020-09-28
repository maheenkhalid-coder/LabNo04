package lab04;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter length");
	    int a = scan.nextInt();
	    System.out.println("Enter breadth");
	    int b = scan.nextInt();
	    if(a==b){
	      System.out.println("Square");
	    }
	    else{
	      System.out.println("Rectangle");
	    }

	}

}
