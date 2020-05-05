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
		System.out.println();
		String input = Validator.getChoice(scnr, "Rock, paper or scissors? (R/P/S): ", new String[] {"R", "P", "S"});
		if (input.startsWith("R")) {
			return Roshambo.ROCK;
		} else if (input.startsWith("P")) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
	}

}
