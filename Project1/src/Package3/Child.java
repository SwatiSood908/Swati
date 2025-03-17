package Package3;

public class Child extends Parent{
	
	public Child()
	{
	

		System.out.println("Child Default Constructor");
	}
	
	public Child(int a)
	{
	super(1);
		System.out.println("Child One Parameterized Constructor");
	}
	public Child(int a ,int b)
	{
		System.out.println("Child Two Parameterized Constructor");
	}
	public Child(int a,int b,int c)
	{
		System.out.println("Child Three Parameterized Constructor");
	}
	public Child(int a,int b,int c ,int d)
	{
		
		System.out.println("Child Four Parameterized Constructor");
	}
	
	
	public static void main(String[] args) {
	
		
		Child obj=new Child(1);
	}
	
	

}
