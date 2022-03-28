package day13_object_oriented_inner_class.association;

public class Body {
	Face face;
	Hand[] hands;
	Body() {
		face = new Face();
		Hand left = new Hand();
		Hand right = new Hand();
		hands = new Hand[] {left, right};
	}
	//外觀
	public void appearance() {
		System.out.println("皮膚");
	}
}
