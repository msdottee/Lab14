package lab14;

import java.util.Scanner;

public class HumanPlayer extends Player{
	
	private Scanner scnr;

	public HumanPlayer(String name, Scanner scnr) {
		super(name);
		this.scnr = scnr;
	}

	@Override
	public Roshambo generateRoshambo() {
		System.out.println("Rock, paper or scissors? (R/P/S): ");
		// ask for choice
		String input = scnr.nextLine();
		// get choice
		// TO DO....validate choice
		if (input.startsWith("r")) {
			return Roshambo.ROCK;
		} else if (input.startsWith("p")) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
		// return corresponding Roshambo enum value
	}

}
