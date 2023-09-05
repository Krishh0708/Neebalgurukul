package neebalgurukulday2;
import java.util.Scanner;
public class Quadra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int x,y;
		System.out.println("Enter");
		x=sc.nextInt();
		y=sc.nextInt();
		if(x>0 &y >0)
			System.out.println("first quadrant");
		else
			if(x<0&y>0)
			System.out.println("second quadrant");
			else
				if(x<0 &y<0)
				System.out.println("third quadrant");
		
				else
				System.out.println("fourth quadrant");
		

	}

}
