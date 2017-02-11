package mumExamSolutions;

public class MagicArray {

	public static void main(String[] args) {
		int[] a = { 0, 4, 6, 10 };
		int i = isMagic(a);
		System.out.println(i);

	}

	public static int isMagic(int[] a) {

		int sum = 0;
		for (int i = 1; i < a.length; i++) {
			if (isPrime(a[i]) == 1) {
				sum = sum + a[i];
			}

		}
		if (sum == a[0]) {
			return 1;
		}

		if (sum == 0 && a[0] == 0 || sum == 0 && isPrime(a[0]) == 1) {
			return 1;
		}
		return 0;

	}

	public static int isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return 0;
			}

		}
		return 1;
	}

}
