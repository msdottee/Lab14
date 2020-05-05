package lab14;

public abstract class Player {
	
	private String name;
	private int score;
	
	public Player(String name) {
		super();
		this.name = name;
		this.score = 0;
	}
	
	public abstract Roshambo generateRoshambo();

	public String getName() {
		return name;
	}
	
	public void incrementScore() {
		score++;
	}
	public int getScore() {
		return score;
	}
	
	public String toString() {
		return name;
	}



}
