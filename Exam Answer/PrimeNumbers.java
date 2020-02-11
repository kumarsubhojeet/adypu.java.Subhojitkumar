public class PrimeNumber
{
	public static void main(String args[])
	{
		int count,pc=1;
		
		System.out.println("Prime Number is: "+pc);
		
		for(int j=2;pc<100;j++)
		{
			count=0;
			for(int i=1;i<j;i++)
			{
				if(j%i==0)
				{
					count=count+1;
				}
			}
			if(count==1)
			{
				System.out.println("Prime Number is: " +j);
				pc=pc+1;
			}
		}
	}
}