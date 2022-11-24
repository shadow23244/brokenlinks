package a123;

import java.util.Scanner;

public class sample4
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String s1 = scan.next();
		String[] a = s1.split(" ");
		int count = 0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			String s = a[i];
			
			System.out.println(s);
			for(int j=0; j<=a.length-1; j++)
			{
				String a1 = a[j];
				System.out.println(a1);
				if(s==a1)
				{
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

}
