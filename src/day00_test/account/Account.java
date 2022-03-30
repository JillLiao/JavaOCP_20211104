package day00_test.account;

public class Account {
	private String name;
	private int money;
	
	public Account(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	public Account() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Accoount [name=" + name + ", money=" + money + "]";
	}
		
}
