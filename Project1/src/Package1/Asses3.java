package Package1;

public class Asses3 {

	public int mul(int a, int b)
	{
		int c ;
		c=a*b;
		System.out.println("Result of Multiplication is" +c);
		return c;
	}
	 
	public int sub(int a, int b)
	{
		int c ;
		c=a-b;
		System.out.println("Result of Subtraction is" +c);
		return c;
	}
	 
	public int add(int a, int b)
	{
		int c ;
		c=a+b;
		System.out.println("Result of Addition is" +c);
		return c;
	}
	 
	public void div(int a, int b)
	{
		int c ;
		c=a/b;
		System.out.println("Result of Division is" +c);
		
	}
	
	public static void main(String[] args) {
		
		Asses3 obj=new Asses3();
		int mult_result=obj.mul(10, 2);
		int sub_result=obj.sub(mult_result, 2);
		int add_result=obj.add(sub_result, 2);
		int sub2_result=obj.sub(add_result, 2);
		obj.div(sub2_result, 2);
	}
	
	
}
