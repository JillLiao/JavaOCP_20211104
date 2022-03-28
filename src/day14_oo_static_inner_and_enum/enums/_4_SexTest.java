package day14_oo_static_inner_and_enum.enums;

public class _4_SexTest {

	public static void main(String[] args) {
		printJob(_3_Sex.女);
		printJob(_3_Sex.男);
	}
	public static void printJob(_3_Sex sex) {
		switch (sex) {
		case 男:
			System.out.println("工程師");
			break;

		case 女:
			System.out.println("會計師");
			break;
		}
	}

}
