package Package4;

import java.util.Scanner;

public class ScannerClass {

	
	public int sum(int x1,int x2)
	{
		int a;
		a=x1+x2;
		System.out.println("Value of x1 is" +x1);
		System.out.println("Value of x2 is" +x2);
		System.out.println("Result of sum is" +a);
		return a;
		
	}
	
	public int sub(int a,int x3)
	{
		int b ;
		b=a-x3;
		System.out.println("Value of a is" +a);
		System.out.println("Value of x3 is" +x3);
		System.out.println("Result of sub is" +b);
		return b;
	}
	
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		System.out.println("Enter value of +k");
	}
	
	
}
