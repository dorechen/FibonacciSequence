import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {

		try {
			int n = Integer.parseInt(args[0]);
			long[] sequence;
			System.out.println("The Fibonacci of " + n + " is " + findFib(n));
			System.out.println("Sequence is " + Arrays.toString(fibSeq(n+1)));
		} catch (NumberFormatException n) {
			System.err.println("Invalid input. Please input a number.");
		}
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

	public static long[] fibSeq(int length) {

		long[] sequence = new long[length];
		sequence[0] = 0;
		sequence[1] = 1;
		for (int i = 2; i < length; i++) {
			sequence[i] = sequence[i-1] + sequence[i-2];
		}
		return sequence;
	}
}