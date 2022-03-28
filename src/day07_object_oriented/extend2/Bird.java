package day07_object_oriented.extend2;

public class Bird extends Animal{
	
	public Bird() {		//Bird的空建構子
		
	}
	
	public Bird(String name) {
		this(name,2); 	// 呼叫 Bird 自己的建構子
	}
	
	public Bird(String name, int legs) {
		super(name, legs);	//呼叫 Animal 建構子
	}
	//一旦Bird繼承了Animal，之後在Main程式new Bid物件時，會連帶地建立起一個Animal物件，使Bird物件有東西繼承，
	//所以這樣的繼承方式可想而知，會耗用大量資源，因此在寫程式時需仔細思考是否真的有必要繼承那麼多東西
	
	@Override
	public void move() {
		System.out.println("我會飛");
	}
	
	@Override
	public String toString() {
		return "Bird [name=" + getName() + ", legs=" + getLegs() + "]";
	}
}
