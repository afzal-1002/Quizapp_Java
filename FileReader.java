import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader  {
	


	public static void fileReader() throws IOException {
		
		String filePath = "C:\\Users\\mrafz\\Desktop\\JavaFile\\";
	
		File file=new File("C:\\Users\\mrafz\\Desktop\\JavaFile\\Sample1.txt"); 
		
//		FileReader fr=new FileReader("C:\\Users\\mrafz\\Desktop\\JavaFile\\Sample1.txt");    
		//		FileReader fr=new FileReader("C:\\Users\\mrafz\\Desktop\\JavaFile\\Sample1.txt");   
		//		FileReader fr=new FileReader("C:\\Users\\mrafz\\Desktop\\JavaFile\\Sample1.txt");   
		//		FileReader fr=new FileReader("C:\\Users\\mrafz\\Desktop\\JavaFile\\Sample1.txt");   
//		FileReader filereader = new FileReader(file);		
//		BufferedReader = new BufferedReader(file);		
//		BufferedReader bfwriter= new BufferedReader(new FileReader(file));
//		BufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\mrafz\\Desktop\\JavaFile\\Sample1.txt"),"UTF-8"));
		
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
		int i = 0;
	
		while((in.read()) != -1) {
			
		}
		
		
		Scanner scan = new Scanner(file);
		System.out.println("===========================================Scanner");
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
		scan.close();

		var results= Files.readAllLines(Paths.get("C:\\Users\\mrafz\\Desktop\\JavaFile\\Sample1.txt"));
		List<String> results1= Files.readAllLines(Paths.get("C:\\Users\\mrafz\\Desktop\\JavaFile\\Sample1.txt"));
		System.out.println("===========================================var results");
		for (String string : results1) {
				
			System.out.println(string);
			System.out.println(string.toString());
		}
		
		
		File file1=new File("C:\\Users\\mrafz\\Desktop\\JavaFile\\Sample1.txt");   
		FileInputStream fis=new FileInputStream(file1);     //opens a connection to an actual file  
		System.out.println("===========================================FileInputStream");
		int r = 0;
		while((r=fis.read())!=-1)   {
			System.out.print((char)r);  
		}		
		fis.close();
	
	}
	
	public static void fileWriter() throws IOException {
		
		String filname = "C:\\Users\\mrafz\\Desktop\\JavaFile\\Sample1.txt";
		File file = new File(filname);
		
		BufferedWriter bfwriter= new BufferedWriter(new FileWriter(file));
		
	}
	
	public static void main(String[] args) throws IOException {
		fileReader();
	}
	

}
