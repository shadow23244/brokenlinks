package a123;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class wirte_data_in_txt_file 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\evers\\eclipse-workspace\\a123\\txt file.txt");
		
		FileWriter fw=new FileWriter(file);
		
		BufferedWriter writer=new BufferedWriter(fw);
		
		writer.write("Hello , Welcome");
		writer.newLine();
		
		writer.write("have a good day");
		writer.newLine();
		
		writer.write("trying out .txt file programs");
		writer.newLine();
		
		writer.write("hopefully it runs");
		writer.newLine();
		
		writer.write("sayonara");
		writer.newLine();
		
		System.out.println("created a .txt file with data");
		
		writer.close();
		
	}

}
