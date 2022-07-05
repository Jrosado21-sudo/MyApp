package fibonacci;
/**
 * 
 * @author Jose
 * @version 5/22/22
 *
 */
public class fibonacci {
/**
 * 
 * @param args nth number for fibonacci 
 */
	public static void main(String[] args) {
		
		//This is the fibonacci nth number outcome 
		
		int n = 10;
		System.out.println("The fibonacci nth number is " + fibonacci(n));
		

	}
      //fibonacci method with n parameter 
	
	private static long fibonacci(int n) {
		if (n <=1) {
			return n;
			}
		return(fibonacci(n - 1) + fibonacci(n - 2));
		
		
	}
	}