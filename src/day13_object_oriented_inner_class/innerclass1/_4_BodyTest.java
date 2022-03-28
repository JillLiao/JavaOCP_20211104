package day13_object_oriented_inner_class.innerclass1;

public class _4_BodyTest {

	public static void main(String[] args) {
		_3_Body body = new _3_Body();
		body.appearance();
		
		_3_Body.Face face = body.new Face();
		face.appearance();
		
		_3_Body.Face.Mouth mouth = face.new Mouth();
		mouth.appearance();
		
		_3_Body.Hands hands = body.new Hands();
		hands.appearance();
	}

}
