package lab04;

import java.util.Scanner;

public class task04 {
	public static void main(String[] args) {
		
		boolean cancel = false;
		int Num1, Num2;
		int number,sum,subtract;
		
		
        Scanner digits = new Scanner(System.in);
       
		System.out.println("\nPress 1:For sum\nPress 2:For subtraction \nPress 3:For Exit.");
		

        System.out.print("\nEnter two number");
        
        System.out.print("\n\nEnter first number:");
        Num1 = digits.nextInt();
        System.out.print("\nEnter second number:");
        Num2 = digits.nextInt();
		

        System.out.print("\nEnter your function number:");
        number = digits.nextInt();
        

        switch(number)
        {
            case 1:
            	 sum = Num1 + Num2;
            	  System.out.printf("The sum of given numbers is: " +sum);
                break;

            case 2:
            	 subtract = Num1 - Num2;
            	 System.out.printf("The differnce of given numbers is: " +subtract);
                break;
            case 3:
            	cancel = true;
            	System.out.println("\nprogram ended!");
				break;
   
            default:
            	
                return;
        }

       

	}

}
