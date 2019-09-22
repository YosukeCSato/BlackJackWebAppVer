package beans;

import java.io.Serializable;

public class Player extends Gamer implements Serializable {

	private String name;
	private int money = 10000;

	public Player() {
	}

	public Player(String name) {
		super(name);
	}

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
