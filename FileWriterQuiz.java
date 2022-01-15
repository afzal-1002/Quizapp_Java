import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterQuiz extends QuizPrograme {

	
	public static void fileWriter() throws IOException {
		
		QuizPrograme quiz = new QuizPrograme();
		
		String filname = "C:\\Users\\mrafz\\Desktop\\JavaFile\\Sample2.txt";
		File file = new File(filname);
		
		
		BufferedWriter bufferwriter= new BufferedWriter(new FileWriter(file));
		
		bufferwriter.append("Name: " + "\t" + "Total Point: " + "\n");

		
		for (int i = 0; i < name.size(); i++) {
			
			bufferwriter.append(name.get(i) + "\t" + output.get(i) + "\n");
		
		}
		
		bufferwriter.close();
		
	}
	
	
	
//	
//	public static void main(String[] args) throws IOException {
//		
//		FileWriterQuiz newfilewriter = new FileWriterQuiz();
//		Scanner scanner = new Scanner(System.in);
//		
//		String cont = "";
//			do {				  
//				Quizapp();
//				System.out.println("Do you want to continue playing (Y/N)?");
//				cont = scanner.nextLine();
//		    }
//		    while (cont.equalsIgnoreCase("Y"));
//			printDetails();	
//			fileWriter();
//	
//	}

}
