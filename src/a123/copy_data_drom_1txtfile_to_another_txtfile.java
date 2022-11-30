package a123;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copy_data_drom_1txtfile_to_another_txtfile
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\evers\\eclipse-workspace\\a123\\txt file.txt");
		
		FileReader fr=new FileReader(file);
		
		BufferedReader reader=new BufferedReader(fr);
		
        File file2=new File("C:\\Users\\evers\\eclipse-workspace\\a123\\txt2 file.txt");
		
		FileWriter fw=new FileWriter(file2);
		BufferedWriter writer=new BufferedWriter(fw);
		
		String str;
		while((str=reader.readLine())!=null)
		{
			writer.write(str);
			writer.newLine();
		}
		
		System.out.println("data copied");
		writer.close();
		reader.close();
		
		
		
		
	}

}
