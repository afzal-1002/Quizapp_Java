import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class QuizPrograme {

	static ArrayList<String> name = new ArrayList<>();
	static ArrayList<String> output = new ArrayList<>();
	
//	static List<List<String>> listquiz = new ArrayList<>();
 
	public static void Quizapp() {
		


		int totalnumber = 0;
		int maxNumber = 0;

//		name.add("Name:");
//		output.add("Total Points:");
		System.out.println("\nInside the Quizz app.. ");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Pelase Enter your Name");

		name.add(scanner.nextLine());

		System.out.println("Please select the correct Answer.");
		System.out.println("Who made most run in cricket?");
		System.out.println("1. Rahul Dravid.\t2. Scahin tendulkar.\t3. Imran Khan.\t4. Ricky ponting.");
		int answer = scanner.nextInt();
		if (answer == 2) {
			totalnumber = totalnumber + 20;
		}

		System.out.println("Who won the most T20 worlcup?");
		System.out.println("1. Engalnd .\t2. Australia.\t3. West Indes.\t4. Paksitan.");
		answer = scanner.nextInt();
		if (answer == 3) {
			totalnumber = totalnumber + 20;
		}

		System.out.println("Who won the most Cricket one_day worlcup?");
		System.out.println("1. Australia .\t2. England.\t3. West Indes.\t4. India.");
		answer = scanner.nextInt();
		if (answer == 1) {
			totalnumber = totalnumber + 20;
		}

		System.out.println("Who is the highest wicket taker in one_day Cricket?");
		System.out.println("1. M Muralitharan .\t2. Wasim Akram.\t3. SL Malinga.\t4. GD McGrath.");
		answer = scanner.nextInt();
		if (answer == 1) {
			totalnumber = totalnumber + 20;
		}

		System.out.println("Who is the highest wicket taker in test cricke?");
		System.out.println("1. M Muralitharan .\t2. Wasim Akram.\t3. Jm Anderson.\t4. Sk Warne.");

		answer = scanner.nextInt();
		if (answer == 1) {
			totalnumber = totalnumber + 20;
		}
		
//		
//
//		name.add("AKRAM");
//		output.add("60");
//		name.add("AFZAL");
//		output.add("90");
//		name.add("ALI");
//		output.add("80");
		
		
		output.add(Integer.toString(totalnumber));

//		scanner.close();
		

		
	}

	

	public static void printDetails() {
		

		System.out.println("Name: "+ "\t" + "Total Points: ");

		for (int i = 0; i < name.size(); i++) {
			
				System.out.println(name.get(i).toString() + "\t" + "  " + output.get(i).toString());			
		}
		
//		name.forEach(System.out::println);
		
//		for (int i = 1; i < listquiz.size(); i++) {
//			
//		System.out.println(Arrays.deepToString(listquiz.toArray()));
//		
//
//	}
//		
//		listquiz.get(0).forEach(s -> System.out.println(s));
//		listquiz.get(1).forEach(s -> System.out.println(s));							
//		System.out.println(listquiz.toString().replaceAll("\\[\\]", ""));
//		System.out.println(listquiz.get(0).toString() + listquiz.get(1).toString());
//		System.out.println(Arrays.deepToString(null));				
//		System.out.println(listquiz.get(0).toString());
//		System.out.println(listquiz.spliterator().toString());				
//		System.out.println(listquiz.get(0).toString());
//		name.forEach(System.out::println);
		
	}
	
	

//	System.out.println(name.get().toString() + "\t"+ output.get(i).toString());

	public static void main(String[] args) throws IOException {
		FileWriterQuiz newfilewriter = new FileWriterQuiz();
		Scanner scanner = new Scanner(System.in);
		
		String cont = "";
			do {				  
				Quizapp();
				System.out.println("Do you want to continue playing (Y/N)?");
				cont = scanner.nextLine();
		    }
		    while (cont.equalsIgnoreCase("Y"));

		printDetails();	
		newfilewriter.fileWriter();
		
		
//		String answer = "";
//		do {
//			Quizapp();
//
//			System.out.println("Do you wnat to Continue (Y/N)?");
//			answer = scanner.nextLine();
//
//		} while (answer.equalsIgnoreCase("Y"));
//
//		scanner.close();
//
//		printDetails();

	}

	
	
}






