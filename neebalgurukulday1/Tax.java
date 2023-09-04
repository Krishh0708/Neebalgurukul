package neebalgurukulday1;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		double Salary,Tax;
		System.out.println("Enter");
		Salary=sc.nextDouble();
		if (Salary>1500000)
			Tax=0.25*Salary;
		else if (Salary>1000000)
			Tax=0.20*Salary;
		else if( Salary>750000)
			Tax =0.10*Salary;
		else
			Tax=0;
		
		System.out.println("Salary"+ Salary);
		System.out.println("Tax" + Tax);
		System.out.print(Salary-Tax);
			
			
			
		
			
	}
	

}
