package lab14;

public abstract class Player {
	
	private String name;
	
	public Player(String name) {
		super();
		this.name = name;
	}
	
	public abstract Roshambo generateRoshambo();

	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}



}
