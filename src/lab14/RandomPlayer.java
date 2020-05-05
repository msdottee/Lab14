package lab14;

import java.util.Random;

public class RandomPlayer extends Player{

	private Roshambo[] choices = Roshambo.values();
	
	public RandomPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		Random random = new Random();
		return choices[random.nextInt(choices.length)];
	}

}
