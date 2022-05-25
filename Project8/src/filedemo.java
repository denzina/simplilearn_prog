
import java.io.BufferedReader;
import java.io.File;
import java.io.File.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class filedemo {
	//three different ways of creating files

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		createFileUsingFileClass();
		createFileusingFileOutputStreamClass();
		createFileIn_NIO();
		List l=readfileInList("E://Files//testFile1.txt");
		Iterator<String> itr=l.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		modifyFile("E://Files//testFile1.txt","test","Rest");
		System.out.println("done");
		//delete
		try
		{
			Files.deleteIfExists(Paths.get("E://Files//testFile3.txt"));
		}
		catch(NoSuchFileException e)
		{
			System.out.println("no such file");
		}
		catch(DirectoryNotEmptyException e)
		{
			System.out.println("directory not empty");
		}
		catch (IOException e) {
			System.out.println("invalid permision");
			// TODO: handle exception
		}
		System.out.println("deletion successful");
		
	}
	
	private static void createFileusingFileOutputStreamClass() throws IOException
	{
		String data="test Data";
		FileOutputStream out=new FileOutputStream("E://Files//testFile2.doc");
		out.write(data.getBytes());
		out.close();
		
	}
	private static void createFileUsingFileClass() throws IOException
	{
		File file=new File("E://Files//testFile1.txt");
		if(file.createNewFile()==true)
		{
			System.out.println("file is created");
			
		}
		else
		{
			System.out.println("file already exist");
		}
		FileWriter writer =new FileWriter(file);
		writer.write("test data 14-5-2022");
		writer.close();
	}
	private static void createFileIn_NIO() throws IOException
	{
		String data="test data";
		Files.write(Paths.get("E://Files//testFile3.txt"), data.getBytes());
		List<String> lines=Arrays.asList("1st Line","2nd Line");
		Files.write(Paths.get("E://Files//file6.txt"),lines,StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		
	}
	//read
	public static List<String> readfileInList(String filename)
	{
		List<String> lines=Collections.emptyList();
		try
		{
			lines=Files.readAllLines(Paths.get(filename),StandardCharsets.UTF_8);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return lines;
	}
	//update
	static void modifyFile(String filePath,String oldString,String newString)
	{
		File fileToBeModifiled=new File(filePath);
		String oldContent="";
		BufferedReader reader=null;
		FileWriter writer=null;
		try
		{
			reader=new BufferedReader(new FileReader(fileToBeModifiled));
			String line=reader.readLine();
			while(line!=null)
			{
				oldContent=oldContent+line+System.lineSeparator();
				line=reader.readLine();
			}
			String newContent=oldContent.replaceAll(oldString, newString);
			writer=new FileWriter(fileToBeModifiled);
			writer.write(newContent);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				reader.close();
				writer.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
