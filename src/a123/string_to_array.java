package a123;


import java.util.Scanner;

public class string_to_array 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
				 
			String s1 = 	scan.next();
			
			
			char[] a =new char[s1.length()];
			
			for(int i=0; i<=s1.length()-1; i++)
			{
				a[i] = s1.charAt(i);
			}
			
			for(char c : a)
			{
				System.out.print(c);
			}
			
		
	}

}
