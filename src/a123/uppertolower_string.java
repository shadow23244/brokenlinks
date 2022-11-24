package a123;

import java.util.Scanner;

public class uppertolower_string 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		String s1 = scan.next();
		
		int count= 0 ;
		String a1= "";
		
		for(int i=0; i<=s1.length()-1; i++)
		{
		     char a = s1.charAt(i);
		     if(a>=65 && a<=90)
		     {
		    	 count++;
		    	char a2 = Character.toLowerCase(a);
		    	a1 = a1 + a2;
		     }
		     
		}
		System.out.println("uppercase letters are :"+ count);
		System.out.println(a1);
		
		
	}

}
