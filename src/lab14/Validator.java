package lab14;

import java.util.Scanner;

public class Validator {

	public static String getChoice(Scanner scnr, String prompt, String[] choices) {
		while (true) {
			System.out.println(prompt);
			String choice = scnr.nextLine();
			
			for (String s : choices) {
				if (choice.equalsIgnoreCase(s)) {
					return s;
				}
			}
			System.out.println("Invalid choice!");			
		}
	}
}
