package Package3;

public class Parent {

	public Parent()
	{
		System.out.println("Parent Default Constructor");
	}
	
	public Parent(int a)
	{
		System.out.println("Parent One Parameterized Constructor");
	}
	public Parent(int a,int b)
	{
		System.out.println("Parent Two Parameterized  Constructor");
	}
	public Parent(int a,int b,int c)
	{
		System.out.println("Parent Three Parameterized  Constructor");
	}
	
	public Parent(int a,int b,int c,int d)
	{
		System.out.println("Parent Four Parameterized  Constructor");
	}
	
	
	public static void main(String[] args) {
		Parent obj=new Parent ();
		
	}

	
	
}
