package a123;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class get_data_from_txt_file
{
	public static void main(String[] args) throws IOException 
	{
		//METHOD 1
		File file=new File("C:\\Users\\evers\\eclipse-workspace\\a123\\txt file.txt");
		
		FileReader fr=new FileReader(file);
		
		BufferedReader reader=new BufferedReader(fr);
		
		String str;
		
		while((str=reader.readLine())!=null)
		{
			System.out.println(str);
		}
		reader.close();
		
		System.out.println("-------------------------------------------------------");
		
		//METHOD 2
		
		Scanner scan=new Scanner(file);
		
		while(scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
		}
		
		System.out.println("-------------------------------------------------------");
		
		//METHOD 3
		
		Scanner scan2=new Scanner(file);
		scan2.useDelimiter("\\Z");
		System.out.println(scan2.next());
		
	}

}
