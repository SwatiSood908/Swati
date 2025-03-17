package Package2;

public class Asses1 {
	
	public Asses1()
	{
		this (1,2,3,4);
		System.out.println("Default Constructor");
	}
	
	public Asses1(int a)
	{
		System.out.println("One Parameterized Constructor");
	}
	
	public Asses1(int a, int b)
	{
		this (1,2,3);
		System.out.println("Two Parameterized Constructor");
	}
	public Asses1(int a,int b , int c)
	{
		System.out.println("Three Parameterized Constructor");
	}
	
	public Asses1(int a,int b , int c, int d)
	{
		System.out.println("Four Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		Asses1 ref=new Asses1();
		Asses1 ref2=new Asses1(1);
		Asses1 ref3=new Asses1(1,2);
	}
	

}
