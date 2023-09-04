package neebalgurukulday1;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		double salary;
		System.out.println("Enter");
	    salary=sc.nextDouble();
	    if (salary<20000)
	    	salary=salary+5000;
	    System.out.println(salary);

	}

}
