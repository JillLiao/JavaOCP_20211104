package day00_test;

public class Test12 {
    public static void main(String[] args) {
        System.out.println("return value of getValue(): " + getValue());
        
        System.out.println("-----------------------");
        
        System.out.println("return value of getValue2():" + getValue2());
    }
	public static int getValue() {
         try {
        	 System.out.println("try...");
        	 throw new Exception();
         } catch(Exception e){
        	 System.out.println("catch...");
        	 return 0;
         }finally {
        	 System.out.println("finally...");
             return 1;
         }
     }
	public static int getValue2() {
		try {
			System.out.println("try...");
			return 0;
		}finally {
			System.out.println("finally...");
			return 1;
		}		
	}
 }