package sample;
import java.util.*;

public class arraygivensum {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[10];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}

	}

}
