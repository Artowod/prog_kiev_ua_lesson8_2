package ua.prog.java.lesson8_2;

public class SpaceShip {

	private String name;
	private double weight;
	private double strength;

	public SpaceShip() {

	}

	public SpaceShip(String name, double weight, double strength) {
		super();
		this.name = name;
		this.weight = weight;
		this.strength = strength;
	}

	@Override
	public String toString() {
		return "SpaceShip [name=" + name + ", weight=" + weight + ", strength=" + strength + "]";
	}

}
