package lab14;

import java.util.Scanner;

public class RoshamboApp {

	private static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println();
		whileLoop();
	}

	private static void whileLoop() {
		boolean playGame = true;
		
		Player player1 = createHumanPlayer();
		Player player2 = selectOpponent();
		
		while (playGame) {
			Roshambo hand1 = player1.generateRoshambo();
			Roshambo hand2 = player2.generateRoshambo();
			
			System.out.println(player1.getName() + " played " + hand1.toString());
			System.out.println(player2.getName() + " played " + hand2.toString());

			findWhoWins(hand1, hand2, player1, player2);
			
			System.out.println();
			String answer = Validator.getChoice(scnr, "Play again (Y/N)?", new String[] {"Y", "N"});
			
			if (answer.equals("N")) {
				playGame = false;
			}
		}
	}

	private static void findWhoWins(Roshambo hand1, Roshambo hand2, Player player1, Player player2) {

		if (hand1.doesBeat(hand2)) {
			System.out.println(player1.getName() + " wins!");
			player1.incrementScore();
		} else if (hand2.doesTie(hand1)) {
			System.out.println("The game is a tie!");
		} else {
			System.out.println(player2.getName() + " wins!");
			player2.incrementScore();
		}
		System.out.println();
		System.out.println("Player 1 has won: " + player1.getScore());
		System.out.println("Player 2 has won: " + player2.getScore());
	}

	private static HumanPlayer createHumanPlayer() {
		String name = GrandCircusValidator.getString(scnr, "What's your name?");
		return new HumanPlayer(name, scnr);
	}

	private static Player selectOpponent() {
		System.out.println();
		String input = Validator.getChoice(scnr, "Would you like to face Andrea or Matt?", new String[] {"Andrea", "Matt"});
		if (input.equals("Andrea")) {
			return new RockPlayer("Andrea");
		} else {
			return new RandomPlayer("Matt");
		}
	}

}
