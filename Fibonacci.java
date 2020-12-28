import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[])
	{
	int i,n,a=1,b=1,c;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	n=sc.nextInt();
	//System.out.println(a);
	//System.out.println(b);
	for(i=3;i<=n;i++)
	{
		c=a+b;
		//System.out.println(c);
		a=b;
		b=c;
		if(i==n)
			System.out.println(c);
		}
	}

}
