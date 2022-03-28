package day05_object_oriented.case4;

public class ATM {

	public static void main(String[] args) {
		
		Account john = new Account("約翰");
		Account mary = new Account("瑪莉");
		john.save(1_0000);
		mary.save(1_0000);
		System.out.println(john + ", " + mary);
		
		john.save(3000);
		mary.withdraw(6000);
		System.out.println(john + ", " + mary);
		
		// john 轉帳給 mary 5000
		john.transfer(5000, mary);
		System.out.println(john + ", " + mary);
	}
}
