package neebalgurukulday1;
import java.util.Scanner;
public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x;
		x=sc.nextInt();
		int hour=x/100;
		hour=hour%12;
		int min=x%100;
		min=min%60;
		System.out.println(hour+":"+min);

       
	}

}
