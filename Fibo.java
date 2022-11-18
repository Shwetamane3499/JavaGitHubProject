import java.util.Scanner;
public class Fibo
{
	public static void main(String args[])
	{
		int n1=0,n2=1,n3,sum=0,temp=0,size;
		System.out.println("Enter Size:");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		
		System.out.println("Fibonaccy series:");
		System.out.println(n1 +"\n"+n2);
		for(int i=0;i<=size-2;i++)
		{	
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
	}
}