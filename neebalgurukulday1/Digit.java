package neebalgurukulday1;

public class Digit {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int a= 753;
int d3= 753%10;
int d2=753/10%10;
int d1=753/10/10;
int rev=d3*100+d2*10+d1;
int sd=d3+d2+d1;
int add=a+rev;
System.out.println("reverse="+rev+"total="+sd+"addrev="+add);
	}

}
