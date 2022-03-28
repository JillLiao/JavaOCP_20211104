package day12_daynamic_array;

public class _8_EmployeeMain {

	public static void main(String[] args) {
		_7_EmployeeCRUD crud = new _7_EmployeeCRUD();
		crud.create(new _2_Employee(101, "John"));
		crud.create(new _2_Employee(102, "Mary"));
		crud.create(new _2_Employee(103, "Bobo"));
		System.out.println(crud.queryAll());
		
		// 員編 101 的姓名要改為 Jack 
		crud.update(101, "Jack");
		System.out.println(crud.queryAll());
		
		// 刪除 員編 101
		crud.delete(101);
		System.out.println(crud.queryAll());
		
		// 誤用 update
		crud.update(new _2_Employee(103, "Bobo"));
	}

}
