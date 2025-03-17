package Package1;

public class Expression2 {
	
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("Result of subtraction is " +c);
		return c;
		}
	public int add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Result of addition is " +c);
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
		Expression2 obj=new Expression2();
		int p=obj.sub(10, 2);
		int q=obj.add(p,2);
		int r=obj.mul(q, 2);
		int s=obj.sub(r, 2);
		obj.div(s, 2);
		
	}

}
