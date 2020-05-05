package lab14;

public enum Roshambo {
	ROCK("Rock", "Scissors"),
	PAPER("Paper", "Rock"),
	SCISSORS("Scissors", "Paper");
	
	private String name;
	private String beats;
	
	private Roshambo(String name, String beats) {
		this.name = name;
		this.beats = beats;
	}
	
	public String toString() {
		return this.name;
	}
	
	public boolean doesBeat(Roshambo other) {
		return this.beats.equals(other.toString());
	}
	
	public boolean doesTie(Roshambo other) {
		return this.name.equals(other.toString());
	}
}
