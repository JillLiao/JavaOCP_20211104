package day00_test;

public class Test10 {
	public static void main(String[] args) {
		int age = 10;
		int var = age++ - --age + age++;	//result= 0
		System.out.printf("var=%d, age=%d\n",var, age);	
		
		age = 10;
		int var2= age++ + age++ ;	//result= -2
		System.out.printf("var=%d, age=%d\n",var2, age);
		
		age = 10;
		var2= age++ + ++age + ++age;	//result= -2
		System.out.printf("var=%d, age=%d\n",var2, age);
		
		age = 10;
		var2= age++ + ++age + ++age + age--;	//result= -2
		System.out.printf("var=%d, age=%d\n",var2, age);
		
		
		age = 10;
		int var3= --age - age++;	//result= 0
		System.out.printf("var=%d, age=%d\n",var3, age);
		
//		age = 10;
//		age= age++;					//result= 12
//		System.out.println(age);
		//System.out.println(plus_(10));
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("\n");
		age = 10;
		
		Object exe = "10";
		System.out.println("exe"+ plus_(exe));
		System.out.println("exe"+ exe);
		
	}
		
	 public static Object plus_(Object input ) {
		 try {
			 //System.out.println("try~"+input);
			 Object rtnInt = Integer.valueOf((String)input);
//			 Integer.valueOf((String) object);
			 return rtnInt;
		} 
		finally{
//			System.out.println("finally 前"+input);
//			 input = input + 1;
//			 System.out.println("finally 後"+input);
			Object rtnInt = Integer.valueOf((String)input)+1;
			
			input = rtnInt;
		}
		 //return input;
	 }
	

}
