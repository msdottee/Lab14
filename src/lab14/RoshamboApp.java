package lab14;

import java.util.Scanner;

public class RoshamboApp {

	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		Player player1 = createHumanPlayer();

		Player player2 = selectOpponent();
		
		//loop to play multiple times
		Roshambo hand1 = player1.generateRoshambo();
		Roshambo hand2 = player2.generateRoshambo();
		
		System.out.println(player1.getName() + " played " + hand1);
		System.out.println(player2.getName() + " played " + hand2);
	}
	
	private static Player selectOpponent() {
		System.out.println("Would you like to face Albert or Bertha?");
		String input = scnr.nextLine();
		if (input.startsWith("A")) {
			return new RockPlayer("Albert");
		} else {
			return new RandomPlayer("Bertha");
		}
	}
	
	private static HumanPlayer createHumanPlayer() {
		System.out.print("What's your name? ");
		String name = scnr.nextLine();
		return new HumanPlayer(name, scnr);
	}

}
