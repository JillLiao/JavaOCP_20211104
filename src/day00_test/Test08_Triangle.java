package day00_test;

public class Test08_Triangle {
	public static void main(String[] args) {
		System.out.println("----直角三角形----");
		for(int i=1; i<=4; i++) {			
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----等腰三角形----");
		for(int i=1;i<=4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------菱形------");
		for(int i=1;i<=4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=3;i>=1;i--) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
