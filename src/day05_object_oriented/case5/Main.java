package day05_object_oriented.case5;

public class Main {

	public static void main(String[] args) {
		Account john = new Account("John");
		Account mary = new Account("Mary");
		ATM_Homework_Teacher atm = new ATM_Homework_Teacher(john, mary);
		atm.start();
	}

}
