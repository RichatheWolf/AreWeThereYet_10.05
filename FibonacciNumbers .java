// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class FibonacciNumbers {
	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n-1) + fib(n-2);
	}
	
	public static void main (String args[]) {
		int n,flag=1;
		
		while(flag==1){
			System.out.println("Enter the integer: ");
			
			// Create Scanner object
			Scanner s = new Scanner(System.in);
			
			// Read the next integer from the screen
			n = s.nextInt();
			//checking the range of fibonacci result to be within int bounds. 0-46
			if(n < 0 && n > 46) {
				System.exit(0);
			}
			System.out.println(fib(n));
			System.out.println("Want more fibonacci calculation (1/0)");
			flag = s.nextInt();
		}
	}
}