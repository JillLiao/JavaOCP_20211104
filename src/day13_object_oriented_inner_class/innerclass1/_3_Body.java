package day13_object_oriented_inner_class.innerclass1;

public class _3_Body {
	public class Face {
		// 外觀
		public void appearance() {
			System.out.println("眼耳鼻口");
		}
		
		public class Mouth {
			// 外觀
			public void appearance() {
				System.out.println("紅唇族");
			}
		}
		
	}
	
	public class Hands {
		// 外觀
		public void appearance() {
			System.out.println("有10隻手指");
		}
	}
	
	// 外觀
	public void appearance() {
		System.out.println("皮膚");
	}
}
