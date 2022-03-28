package day00_test;

public class Test10 {

	public static void main(String[] args) {
		int age = 10;
		int var = age++ - --age;
		int var2= age++ - ++age;
		int var3= --age - ++age;
		age= age++;
		System.out.println(var);	//result= 0
		System.out.println(var2);	//result= -2
		System.out.println(var3);	//result= -1
		System.out.println(age);	//result= 12
	}

}
