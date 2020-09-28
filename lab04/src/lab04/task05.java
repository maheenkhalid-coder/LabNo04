package lab04;

import java.util.Scanner;

public class task05 {

	public static void main(String[] args) {
		int x, y, z;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        x = scan.nextInt();
        System.out.println("Enter the second number:");
        y = scan.nextInt();
        System.out.println("Enter the third number:");
        z = scan.nextInt();
        if(x > y && x > z)
        {
            System.out.println("Largest number is: "+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is: "+y);
        }
        else
        {
            System.out.println("Largest number is: "+z);
        }
	}

}
