package Package1;

public class Class1 {
	
	 public int add(int a,int b)
	 {
	 int c;
	 c=a+b;
	 System.out.println("Result of Addition is " +c );
	 return c;
	 }
	
	
	 public int sub(int e,int f)
	 {
	 int g;
	 g=e-f;
	 System.out.println("Result of Subtraction is " +g);
	 return g;
	 }
	
	 
	 public int mul(int i, int j)
	 {
		 int k;
		 k=i*j;
		 System.out.println("Result of multiplication is " +k);
		 return k;
	 }
	
    public void div(int x, int y)
    { 
    	int z;
    	z=x/y;
    	System.err.println("Final Result is" +z);
    }
	 
	 public static void main(String[] args) {
	
		 Class1 obj=new Class1();
		 int add_result=obj.add(10, 2);
		int sub_result= obj.sub(add_result, 2);
		int mul_result=obj.mul(sub_result, 2);
		int sum2=obj.add(mul_result, 2);
		obj.div(sum2,2);
	}


}
