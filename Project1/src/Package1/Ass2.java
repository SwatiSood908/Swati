package Package1;

public class Ass2 {
	
	public int sub(int a,int b)
	
	{ 
		int c;
		c=a-b;
		System.err.println("Result of subraction is " +c);
		return c;
	}
	 public int add(int e,int f)
	 {
		 int g;
		 g=e+f;
		 System.out.println("Result of addition is " +g);
		 return g;
	 }
	
	
	public int mul(int j, int k)
	{
		int l;
		l=j*k;
		System.out.println("Result of Multiplication is "  +l);
		return l;
	}
	
	public void div (int x , int y)
	{
		int z;
		z=x/y;
		System.out.println("Final Result is " +z);
		
	}
	
	public static void main(String[] args) {
		
		Ass2 obj=new Ass2();
		int sub_result=obj.sub(10, 2);
		int add_result=obj.add(sub_result,2);
		int add2_result=obj.add(add_result, 2);
		int mul_result=obj.mul(add2_result,2);
		obj.div(mul_result,2);
		
		
	}
	
	

}
