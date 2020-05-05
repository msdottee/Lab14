package lab14;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RoshamboApp {

	private static Scanner scnr = new Scanner(System.in);
	private static List<Integer> score = new ArrayList<>();
	private static Map<Roshambo, Roshambo> beats = new EnumMap<>(Roshambo.class);
	static {
		beats.put(Roshambo.ROCK, Roshambo.SCISSORS);
		beats.put(Roshambo.PAPER, Roshambo.ROCK);
		beats.put(Roshambo.SCISSORS, Roshambo.PAPER);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println();
		whileLoop();
	}

	private static void whileLoop() {
		boolean playGame = true;
		while (playGame) {
			makeChoices();
			System.out.println();
			System.out.println("Play again?");
			String answer = scnr.nextLine().toLowerCase();
			if (answer.startsWith("n")) {
				playGame = false;
			}
		}
	}

	private static void makeChoices() {
		Player player1 = createHumanPlayer();
		Player player2 = selectOpponent();
		Roshambo hand1 = player1.generateRoshambo();
		Roshambo hand2 = player2.generateRoshambo();
		System.out.println(player1.getName() + " played " + hand1);
		System.out.println(player2.getName() + " played " + hand2);
		findWhoWins(hand1, hand2, player1, player2);

	}

	private static void findWhoWins(Roshambo hand1, Roshambo hand2, Player player1, Player player2) {
		int player1score = 0;
		int player2score = 0;

		if (beats.containsKey(hand1) && beats.containsValue(hand2)) {
			System.out.println(player1.getName() + " wins!");
			player1score = player1score + 1;
		} else if (beats.containsKey(hand2) && beats.containsValue(hand1)) {
			System.out.println(player2.getName() + " wins!");
			player2score = player2score + 1;
		} else {
			System.out.println("The game is a tie!");
		}
	}

	private static HumanPlayer createHumanPlayer() {
		System.out.print("What's your name? ");
		String name = scnr.nextLine();
		return new HumanPlayer(name, scnr);
	}

	private static Player selectOpponent() {
		System.out.print("Would you like to face Andrea or Matt?");
		String input = scnr.nextLine();
		if (input.startsWith("A")) {
			return new RockPlayer("Albert");
		} else {
			return new RandomPlayer("Bertha");
		}
	}

}
