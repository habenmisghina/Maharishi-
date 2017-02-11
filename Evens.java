package mumExamSolutions;

public class Evens {

	public static void main(String[] args) {
		int number = -34680;
		int i = isEven(number);
		System.out.println(i);

	}

	public static int isEven(int n) {
		int lastDigit = 0;
		while (n > 0) {
			lastDigit = n % 10;
			n = n / 10;
			if (lastDigit % 2 != 0) {
				return 0;

			}
		}
		return 1;
	}

}
