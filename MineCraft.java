package ua.prog.java.lesson8_2;

public class MineCraft {
	private String version;

	public MineCraft() {

	}

	public MineCraft(String version) {
		super();
		this.version = version;
	}

	@Override
	public String toString() {
		return "MineCraft [version=" + version + "]";
	}
}
