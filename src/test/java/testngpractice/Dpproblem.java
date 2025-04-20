package testngpractice;

public class Dpproblem {

	public static int countWays(int n) {
		if (n < 0) return 0;
        if (n == 0) return 1;
		return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
	}

	public static void main(String[] args) {
		int stairs = 3;
		System.out.println(countWays(stairs));
	}

}
