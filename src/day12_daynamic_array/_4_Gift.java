package day12_daynamic_array;

import java.util.Objects;

public class _4_Gift {
	private Integer num;   // 獎號
	private String name;   // 獎名
	private Integer count; // 數量
	
	public _4_Gift() {
		
	}
	
	public _4_Gift(Integer num, String name, Integer count) {
		this.num = num;
		this.name = name;
		this.count = count;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(count, name, num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		_4_Gift other = (_4_Gift) obj;
		return Objects.equals(count, other.count) && Objects.equals(name, other.name) && Objects.equals(num, other.num);
	}

	@Override
	public String toString() {
		return "Gift [num=" + num + ", name=" + name + ", count=" + count + "]";
	}
}
