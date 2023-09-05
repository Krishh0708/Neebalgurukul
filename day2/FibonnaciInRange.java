package neebalgurukulday2;

import java.util.Scanner;

public class FibonnaciInRange {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the lower bound: ");
	        int lowerBound = scanner.nextInt();

	        System.out.print("Enter the upper bound: ");
	        int upperBound = scanner.nextInt();

	        int a = 0, b = 1;

	        System.out.println("Fibonacci numbers within the range: ");
	        for (int i = a; i <= upperBound; ) {
	            if (i >= lowerBound) {
	                System.out.print(i + " ");
	            }
	            int next = a + b;
	            a = b;
	            b = next;
	            i = a;  // Update the loop variable to the current Fibonacci number
	        }

	        scanner.close();

	}

}
