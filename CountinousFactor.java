package mumExamSolutions;

public class CountinousFactor {

	public static void main(String[] args) {
		int n = 90;
		int i = isCountinous(n);
		System.out.println(i);

	}

	public static int isCountinous(int n) {
		int product = 1;
		for (int i = 1; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				product = i * j;
				if (n == product) {
					return 1;
				}
				if (product > n) {
					product = 1;
					break;
				}
			}

		}
		return 0;
	}

}
