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
}

class C extends B
{
	int c;
	
	void set_c(int k)
	{
		c=k;
	}
	
	void show_c()
	{
		System.out.println("C : " +c);
	}
	
	void mul()
	{
		int d;
		
		d=a*b*c;
		System.out.println("Multiplication : " +d);
	}
}

class MultilevelDemo
{
	public static void main(String args[])
	{
		int a,b,c;
		
		Scanner In=new Scanner(System.in);
		
		System.out.print("Enter A : ");
		a=In.nextInt();
		
		System.out.print("Enter B : ");
		b=In.nextInt();
		
		System.out.print("Enter C : ");
		c=In.nextInt();
		
		C c1=new C();
	
		c1.set_a(a);
		c1.set_b(b);
		c1.set_c(c);
		c1.show_a();
		c1.show_b();
		c1.show_c();
		c1.mul();
	}
}