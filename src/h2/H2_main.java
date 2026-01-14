package h2;

public class H2_main {

	private static int CACHE_SIZE = 1000;
	private static long[] fibCache = new long[CACHE_SIZE];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		benchmark(20); 
//						Elapsed nanoseconds fibonacci(a): 414600 Ergebnis: 6765
//						Elapsed nanoseconds fibonacciCached(b): 13200 Ergebnis: 6765
//						Elapsed nanoseconds fibonacciIterative(c): 4700 Ergebnis: 6765
		benchmark(10);
//						Wenn beide nach einander liefen:
//						Elapsed nanoseconds fibonacci(a): 1900 Ergebnis: 55
//						Elapsed nanoseconds fibonacciCached(b): 400 Ergebnis: 55
//						Elapsed nanoseconds fibonacciIterative(c): 900 Ergebnis: 55
		
	}

	public static void benchmark(int n) {
		//a 
		long start = System.nanoTime();
		long result = fibonacci(n);
		long timeA = System.nanoTime() - start;
		System.out.println("Elapsed nanoseconds fibonacci(a): " + timeA + " Ergebnis: "+ result);
		
		//b
		start = System.nanoTime();
		result =fibonacciCached(n);
		long timeB = System.nanoTime() - start;
		System.out.println("Elapsed nanoseconds fibonacciCached(b): " + timeB+ " Ergebnis: "+ result);
		
		//c
		start = System.nanoTime();
		result = fibonacciIterative(n);
		long timeC = System.nanoTime() - start;
		System.out.println("Elapsed nanoseconds fibonacciIterative(c): " + timeC+ " Ergebnis: "+ result);
	}
	
	//a
	public static long fibonacci(int n) {
		if( n <= 2) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	//b
	public static long fibonacciCached(int n) {
		if (n < CACHE_SIZE && fibCache[n] != 0) {
			return fibCache[n];
		}
		if (n <= 2) {
			return 1;
		}
		long result = fibonacciCached(n-1) + fibonacciCached(n -2);
		if (n < CACHE_SIZE) {
			fibCache[n] = result;
		}
		
		return result; 
	}
	
	
	//c
	public static long fibonacciIterative(int n) {
		if(n <= 2) return 1;
		long prev = 1;
		long curr = 1;
		for (int i = 3; i <= n; i ++) {
			long next = prev +curr;
			prev = curr;
			curr = next;
		}
		return curr;
	}
	
}
