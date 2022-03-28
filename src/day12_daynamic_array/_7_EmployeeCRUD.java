package day12_daynamic_array;

import java.util.ArrayList;

public class _7_EmployeeCRUD implements _6_CRUD<_2_Employee>{
	// 存放員工物件的動態陣列
		private static ArrayList<_2_Employee> employees = new ArrayList<>();
	
	@Override
	public void create(_2_Employee e) {
		employees.add(e);
	}

	@Override
	public void update(_2_Employee e) {
		throw new RuntimeException("此方法在此不使用");
	}


	// 專屬給 EmployeeCRUD 所使用的 Update
	public void update(Integer num, String name) {
		_2_Employee emp = getOne(num);
		if(emp != null) {
			emp.setName(name);
			System.out.println("修改成功");
		} else {
			System.out.println("修改失敗: 無此員編");
		}
	}
	
	@Override
	public void delete(Integer num) {
		_2_Employee emp = getOne(num);
		if(emp != null) {
			employees.remove(emp);
			System.out.println("刪除成功");
		} else {
			System.out.println("刪除失敗: 無此員編");
		}
	}

	@Override
	public _2_Employee getOne(Integer num) {
		_2_Employee employee = null;
		for(_2_Employee e : employees) { // 根據員編找到員工
			if(e.getNum() == num) {
				employee = e;
				break;
			}
		}
		return employee;
	}

	@Override
	public _2_Employee getOne(String name) {
		_2_Employee employee = null;
		for(_2_Employee e : employees) { // 根據姓名找到員工
			if(e.getName().equals(name)) {
				employee = e;
				break;
			}
		}
		return employee;
	}

	@Override
	public ArrayList<_2_Employee> queryAll() {
		return employees;
	}
	
}
