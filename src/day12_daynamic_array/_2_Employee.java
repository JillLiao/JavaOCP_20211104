package day12_daynamic_array;

import java.util.Objects;

public class _2_Employee {
	private Integer num; // 員工編號
	private String name; // 員工姓名
	
	public _2_Employee() {
		
	}
	public _2_Employee(Integer num, String name) {
		this.num = num;
		this.name = name;
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
	
	@Override
	public int hashCode() {
		return Objects.hash(name, num);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		_2_Employee other = (_2_Employee) obj;
		return Objects.equals(name, other.name) && Objects.equals(num, other.num);
	}
	
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + "]";
	}
}
