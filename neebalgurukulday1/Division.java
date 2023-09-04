package neebalgurukulday1;

import java.util.Scanner;
1 
public class Division {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		double x,y,z;
		System.out.println("Enter");
		x=sc.nextDouble();
		y=sc.nextDouble();
		z=sc.nextDouble();
		double z=x>y ? x/y : y/x;
		System.out.println(z);
		
		
		
   
	}

}
