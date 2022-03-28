package day12_daynamic_array;

import java.util.ArrayList;

public class _3_ArrayListDemo2 {

	public static void main(String[] args) {
		_2_Employee e1 = new _2_Employee(101, "John");
		_2_Employee e2 = new _2_Employee(102, "Mary");
		_2_Employee e3 = new _2_Employee(201, "Bobo");
		
		ArrayList<_2_Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(new _2_Employee(301, "Helen"));
		
		System.out.println(emps);
		
		// 取得 index = 1 的員工物件
		System.out.println(emps.get(1));
		
		// 請找出 員編 = 201 的姓名 = ?
		for(_2_Employee emp : emps) {
			if(emp.getNum() == 201) {
				System.out.println(emp.getName());
				break;
			}
		}
		// 請找出 姓名=Helen 的員編 = ?
		for(_2_Employee emp : emps) {
			if(emp.getName().equals("Helen")) {
				System.out.println(emp.getNum());
				break;
			}
		}
		// 移除 index = 0 的員工
		emps.remove(0);
		System.out.println(emps);
		
		// 想要移除 e2 = new Employee(102, "Mary");
		emps.remove(e2);
		System.out.println(emps);
		
		// 想要移除 new Employee(301, "Helen");
		// 先找到 Helen 員工物件
		_2_Employee helen = null;
		for(_2_Employee emp : emps) {
			if(emp.getName().equals("Helen")) {
				helen = emp;
				System.out.println("找到 Helen: " + helen);
				break;
			}
		}
		emps.remove(helen);
		System.out.println(emps);
		
		// 想要移除 bobo
		_2_Employee bobo = new _2_Employee(201, "Bobo");
		emps.remove(bobo);
		System.out.println(emps);
	}

}
