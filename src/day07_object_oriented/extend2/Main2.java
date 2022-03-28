package day07_object_oriented.extend2;

public class Main2 {
	
	public static void main(String[] args) {
		
		Bird bird = new Bird("白文鳥", 2);
		// 想要印出 "白文鳥有 2 隻腳"
		System.out.println(bird);
		bird.move();
		
		System.out.println("------------------");
		
		Ostrich ostrich = new Ostrich("鴕鳥");
		System.out.println(ostrich);
		ostrich.move();
		
	}
}
