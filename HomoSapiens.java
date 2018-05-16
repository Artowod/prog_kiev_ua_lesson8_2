package ua.prog.java.lesson8_2;

public class HomoSapiens {
	private int age;
	private String location;

	public HomoSapiens() {

	}

	public HomoSapiens(int age, String location) {
		super();
		this.age = age;
		this.location = location;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "HomoSapiens [age=" + age + ", location=" + location + "]";
	}
}
