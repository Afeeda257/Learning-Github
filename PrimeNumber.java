import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[])
	{
		int num,i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		
		for(i=2;i<num;i++)
		{
			k=0;
			for(j=2;j<i;j++)
				{
					if(i%j==0)
						k=1;
				}
				if (k==0)
					System.out.println(i);
			
		}
		
	}

}
