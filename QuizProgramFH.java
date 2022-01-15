	

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class QuizProgramFH {

	public static void main(String[] args) throws IOException, InterruptedException {
		int score = 0;
		System.out.println("Quiz Program");
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter your name");
		var name = sca.next();

		if (name == null) {
			System.out.println("Please enter your name");
		} else {
			System.out.println("Starting the quiz");
			Thread.sleep(100);
		}

		System.out.println("Q1. Biggest animal in land");
		System.out.println("----Options are----");
		System.out.println("1.Elephant\n2.Girraffe\n3.Dog\n4.Raccon");
		var o = sca.nextInt();
		if (o == 1) {
			System.out.println("Correct");
			score += 20;
		} else {
			System.out.println("Please try again");
		}

	}

}
