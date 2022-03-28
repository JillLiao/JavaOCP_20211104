package day08_object_oriented.overloading;

public class SumTest {
	public static void doSum(Integer X, Integer Y) {
        System.out.println("Integer sum is " + (X + Y));
    }
 
    public static void doSum(double x, double Y) {
        System.out.println("double sum is " + (x + Y));
    }
 
    public static void doSum(float x, float Y) {
        System.out.println("float sum is " + (x + Y));
    }
    
    public static void doSum(int x, int Y) {
        System.out.println("int sum is " + (x + Y));
    }
    
    public static void main(String[] args) {
        doSum(10, 20);
        doSum(10.0, 20.0);
        doSum(Integer.valueOf(10), Integer.valueOf(20));
        
        Integer a = 10;
        Integer b = 20;
        int c = 30;
        doSum(a, b);
        // doSum(a, c); // 編譯錯誤，帶入的參數必須【同時為int】或【同時為Integer】，
        //當【一個int另一個Integer】時無法auto-boxing
        
        doSum(a.intValue(), c);
        doSum(a, new Integer(c)); // 已廢棄的寫法，所以會有刪除號
    }
}
