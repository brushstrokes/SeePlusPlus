package lab8;

public class Factorial {

	public static void main(String[] args) {
		int n = 20;
		int factorial = 1;
		
		int i = 1;
		while (i <= n) {
			factorial = factorial * i;
			i++;
		}
		System.out.println("The Factorial of " + n + " is " + factorial);
	}
}
