package Package1;

public class Expression1 {
	
	public int add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Result of addition is " +c);
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("Result of subtraction is " +c);
		return c;
		}
	
	public int mul(int a,int b)
	{
		int c;
		c=a*b;
		System.out.println("Result of multiplication is " +c);
		return c;
		}
	
	public void div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("Final result is " +c);
		}
	
	public static void main(String[] args) {
		
		Expression1 obj=new Expression1();
		int x=obj.add(10, 2);
		int y=obj.add(x, 2);
		int z=obj.sub(y, 2);
		int q=obj.mul(z, 2);
		obj.div(q, 2);
	
		
	}
	

}
