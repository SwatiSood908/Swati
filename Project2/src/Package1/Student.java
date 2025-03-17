package Package1;

public class Student {
	
	
	int age;
	int roll_nr;
	
	public void display1()
	{
		System.out.println("I am method1");
	}

	public void display2()
	{
		System.out.println("I am method2");
	}
	
	public static void main(String[] args) {
		
		Student ref1=new Student();
		ref1.age=5;
		ref1.roll_nr=25;
		System.out.println("Value of age is " +ref1.age);
		System.out.println("Value of roll_nr is " +ref1.roll_nr);
		ref1.display1();
		ref1.display2();
		
		Student ref2=new Student();
		ref2.age=10;
		ref2.roll_nr=50;
		System.out.println("Value of age is " +ref2.age);
		System.out.println("Value of roll_nr is " +ref2.roll_nr);
		ref2.display1();
		ref2.display2();
		
	}
	
	
	
}
