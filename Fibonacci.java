public class Fibonacci {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		System.out.println("Finding fibonacci of " + n);
		System.out.println(findFib(n));
	}

	public static int findFib(int n) {

		if(n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return findFib(n-1) + findFib(n-2);
		}
	}
}