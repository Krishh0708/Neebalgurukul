package neebalgurukulday1;

import java.util.Scanner;

public class Leepyear {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		double Leapyear;
		System.out.println("Enter");
	    Leapyear=sc.nextDouble();
	 
	    if ((Leapyear%100==0 && Leapyear%400==0) || (Leapyear%100!=0 && Leapyear%4==0))
	    	System.out.println("Leapyear");
	    	
	    
	    
	    
	    else System.out.println("Not leapyear"); 
	    	
	    	

	}

}
