package Package2;

public class Ass2 {
	
	
	public void method0()
	{
	this.method3();
		System.out.println("Default Method");
	}
	
	public void method1()
	{
		this.method4();
		this.method2();
		System.out.println("One Parameterized Method");
	}
	public void method2()
	{
	
		System.out.println("Two Parameterized Method");
	}
	public void method3()
	{
		System.out.println("Three Parameterized Method");
	}
	public void method4()
	{
	
		System.out.println("Four Parameterized Method");
	}
	 public static void main(String[] args) {
		
		 Ass2 obj=new Ass2();
		 obj.method0();
		
		 obj.method1();
		 
	

		 
	}
	
	
	
	
	
	
	
	

}
