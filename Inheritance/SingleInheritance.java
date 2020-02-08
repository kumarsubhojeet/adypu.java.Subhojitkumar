import java.util.*;

class A
{
	int a;
	
	void set_a(int i)
	{
		a=i;
	}
	
	void show_a()
	{
		System.out.println("A : " +a);
	}
}

class B extends A
{
	int b;
	
	void set_b(int j)
	{
		b=j;
	}
	
	void show_b()
	{
		System.out.println("B : " +b);
	}
	
	void mul()
	{
		int c;
		
		c=a*b;
		System.out.println("Multiplication : " +c);
	}
}

class SingleInheritance
{
	public static void main(String args[])
	{
		int a,b;
		
		Scanner In=new Scanner(System.in);
		
		System.out.print("Enter A : ");
		a=In.nextInt();
		
		System.out.print("Enter B : ");
		b=In.nextInt();
		
		B b1=new B();
	
		b1.set_a(a);
		b1.set_b(b);
		b1.show_a();
		b1.show_b();
		b1.mul();
	}
}