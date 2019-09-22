package beans;

import java.io.Serializable;

public class Gamer implements Serializable {

	private String name;
	private int money;

	public Gamer() {

	}

	public Gamer(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getMoney() {
		return this.money;
	}

}
