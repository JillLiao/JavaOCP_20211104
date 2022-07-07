package day24_thread_scheduled_fork_join;

public class Fibo {
	public long compute(int goal) {
		long[] fib= new long[goal];
		fib[0]=1;
		fib[1]=1;
		for(int i=2;i<goal;i++) {
			fib[i]= fib[i-1]+fib[i-2];
		}		
		return fib[goal-1];
	}
	public static void main(String[] args) {
		System.out.println(new Fibo().compute(50));

	}

}
