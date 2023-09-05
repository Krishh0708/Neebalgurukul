package neebalgurukulday2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int x1=0,x2=1,x3=0;
		System.out.println();
		for(int i=2;i<=n;i++)
      x3=x1+x2;
		if(x3%2==0) {
			System.out.println(" "+x3);
		}
			
		
		x1=x2;
		x2=x3;
		
	}

}
