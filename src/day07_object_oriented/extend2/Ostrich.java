package day07_object_oriented.extend2;

public class Ostrich extends Bird{
	
	public Ostrich(String name) {
		super(name);	//呼叫父類別參數為  (String){} 的建構子
	}
	
	@Override
	public void move() {
		System.out.println("我會跑，但我不會飛");
	}

	@Override		//這裡如果沒有toString的話，到時候out.print(ostrich)時，就會呼叫Bird的toString
	public String toString() {
		return "Ostrich [name=" + getName() + ", legs=" + getLegs() + "]";
	}
}
